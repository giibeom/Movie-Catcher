$(document).ready(function(){


  var api_key = "55d244c83c49693b6fd6606c768103eb";

  var url = "https://api.themoviedb.org/3/search/movie?api_key=" + api_key + "&language=ko-KR&query=" + mvName +"&page=1";

  $.ajax({
    url : url,
    type : "GET",
    cache : false,
    success : function(data, status) {
      if(status == "success") {
        // 무비DB 영화정보 접근
        getMovieInfo(data, api_key, mvName);
      } else {
        alert("에러");
        history.back();
      }
    }
  });
});

function noMovie() {
  alert("해당 영화는 검색되지 않습니다");
  history.back();
}



// movieDB API
  function getMovieInfo(jsonObj, api_key, mvName) {

    var total_result = jsonObj.total_results;

    if(total_result != 0) {

    var results = jsonObj.results;
    var chk;
      for(var i = 0; i < results.length; i++) {
        if(mvId == results[i].id) {
          chk = i;
          break;
        }
      }
      results = jsonObj.results[chk];

    var mv_id = results.id;
    var poster = results.poster_path;
    var mv_title = results.title;
    var mv_avg = results.vote_average;
    var overview = results.overview;
    var date = results.release_date;

    var imgUrl = "http://image.tmdb.org/t/p/w500";

    $("#mainPoster").attr("src", imgUrl + poster);
    $("#mv_title").html(mv_title);
    $("#mv_avg").html(mv_avg);
    $("#overview").html(overview);
    $("#date").html(date);

  
    getIdVideo(mv_id, api_key);
    getIdBackdrops(mv_id, api_key);

    } else {
      noMovie();
    }
    var getMovieName = mvName.split(":").join("");
    var checkMovieName = getMovieName.split(" ")[0];
    
    var api_key2 = "150bfb37a86f8bfb899cdc5192ee9967";
    url2 = "http://www.kobis.or.kr/kobisopenapi/webservice/rest/movie/searchMovieList.json?key=" + api_key2 + "&movieNm=" + checkMovieName;

    $.ajax({
      url : url2,
      type : "GET",
      cache : false,
      success : function(data, status) {
        if(status == "success") {
          // 영화진흥원 영화목록 접근
          getMovieList(data, api_key2, mvName);
        } else {
          alert("에러");
          history.back();
        }
      }
    });
  }

  function getIdVideo(mv_id, api_key) {

    url = "https://api.themoviedb.org/3/movie/" + mv_id + "/videos?api_key=" + api_key + "&language=ko-KR";

    $.ajax({
      url : url,
      type : "GET",
      cache : false,
      success : function(data, status) {
        if(status == "success") {
          getVideo(data);
        }
      }
    });

  }

  function getVideo(jsonObj) {
    var results = jsonObj.results;

    var video_key = "";
    if(results.length != 0) {

    for(var i = 0; i < results.length; i++) {
      if((results[i].name).indexOf("메인") != -1) {
        video_key = results[i].key;
        break;
      } 
    }

    if(video_key == "") {
      for(var i = 0; i < results.length; i++) {
        if((results[i].name).indexOf("예고편") != -1) {
            video_key = results[i].key;
            break;
        }
      }
    }

    if(video_key == "") {
      video_key = results[0].key;
    }

    var videoUrl = "https://www.youtube.com/embed/";

    $("#mv_teaser").attr("src", videoUrl + video_key);

  } else {
    $("#mv_teaser").attr("display", "none");
    $("#teaserNull").attr("display", "block")    
  }

  }

  function getIdBackdrops(mv_id, api_key) {
    url = "https://api.themoviedb.org/3/movie/" + mv_id + "/images?api_key=" + api_key;

    $.ajax({
      url : url,
      type : "GET",
      cache : false,
      success : function(data, status) {
        if(status == "success") {
          getBackdrops(data);
        }
      }
    });
  }

  function getBackdrops(jsonObj) {

    var backdrops = jsonObj.backdrops;
    var data = [];
    for(var i = 0; i < backdrops.length; i++) {
      var stealCut = "<img src='http://image.tmdb.org/t/p/w500" + backdrops[i].file_path + "' width='100%' height='400'>";
      data[i] = stealCut;
    }

    if(data.length == 0) {
      $("#scrolling").attr("display", "none");
      
    }

    $(function() {
      $("#scrolling").srolling({
        data : data,
        auto : true,
        item_count : 1, 
        cache_count : 4, 
        width:  550,
        height : 400,
        delay_frame : 500,
        move : 'left',
        prev : '#leftBtn',
        next : '#rightBtn',
      });
    });
  }




// 영화진흥원 API

  function getMovieList(jsonObj, api_key2, movieNm) {

    var totCnt = jsonObj.movieListResult.totCnt;

    if(totCnt != 0) {
      
      var movieList = jsonObj.movieListResult.movieList;
      var ck = -1;
      
      for(var i = 0; i < movieList.length; i++) {
        if(( (movieList[i].movieNm) == (movieNm) ) || (((movieList[i].movieNm).toLowerCase().split(" ").join("")).match(movieNm.toLowerCase().split(" ").join(""))) ) {
          ck = i;
          break;
        }
      }
      if(ck == -1) ck = 0;

      movieList = jsonObj.movieListResult.movieList[ck];

      var movieCd = movieList.movieCd;

      var directors = movieList.directors;
        for(var i = 0; i < directors.length; i++) {
          $("#directors").html(directors[i].peopleNm + " ");
        } 

      var genre = movieList.genreAlt;
      $("#genre").html(genre);

      getIdMovieDetailList(movieCd, api_key2);
    }

  }

  function getIdMovieDetailList(movieCd, api_key2) {
    url2 = "http://www.kobis.or.kr/kobisopenapi/webservice/rest/movie/searchMovieInfo.json?key=" + api_key2 + "&movieCd=" + movieCd;

    $.ajax({
      url : url2,
      type : "GET",
      cache : false,
      success : function(data, status) {
        if(status == "success") {
          getMovieDetailList(data);
        }
      }
    });
  }

  function getMovieDetailList(jsonObj) {

    var movieInfo = jsonObj.movieInfoResult.movieInfo;

    var actors = movieInfo.actors;
    var actorResult = "";

  if(actors.length >= 6) {

    for(var i = 0; i < 6; i++) {
      if(i == 5) {
        actorResult +=  actors[i].peopleNm + "(" + actors[i].cast + ") 등등";  
        break;
      }
      actorResult +=  actors[i].peopleNm + "(" + actors[i].cast + ") │ ";
    }

  } else {

    for(var i = 0; i < actors.length; i++) {
      if(i == actors.length - 1) {
        actorResult +=  actors[i].peopleNm + "(" + actors[i].cast + ")";  
        break;
      }
      actorResult += actors[i].peopleNm + "(" + actors[i].cast + ") │ ";
    }

  }

    $("#actors").html(actorResult);

    var showTm = movieInfo.showTm;
      $("#showTm").html(showTm + "분");

    var audits = movieInfo.audits;
    if(audits.length != 0) {
      $("#watchGrade").html(audits[0].watchGradeNm);
    } else {
      $("#watchGrade").html("없음");
    }

  }

// movieDB 와 진흥원이 같은 영화인데도 불구하고 title 이 다름(TODO)
