package class1.ex;

public class MovieReviewMain2 {

    public static void main(String[] args) {


        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃 타임";
        aboutTime.review = "삶의 교훈";

        MovieReview batMan = new MovieReview();
        batMan.title = "베트맨";
        batMan.review = "다크나이트";

        MovieReview[] movieReviews = {aboutTime, batMan};

        for (MovieReview m : movieReviews) {

            System.out.println("제목: " + m.title + " 한줄평: " + m.review);
        }
    }
}
