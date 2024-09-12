package class1.ex;

public class MovieReviewMain1 {

    public static void main(String[] args) {

        MovieReview aboutTime = new MovieReview();

        aboutTime.title = "어바웃 타임";
        aboutTime.review = "삶의 교훈";

        MovieReview batMan = new MovieReview();
        batMan.title = "베트맨";
        batMan.review = "다크나이트";

        System.out.println("영화 제목: " + aboutTime.title + " 한줄평: " + aboutTime.review);
        System.out.println("영화 제목: " + batMan.title + " 한줄평: " + batMan.review);
    }
}
