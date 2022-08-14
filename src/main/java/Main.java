public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Александр";
        post.passport = "4564 № 55646546";
        post.patronymic = "Анатольевич";
        post.phone = "+7 (926)-561-27-40";
        post.surname = "Вергизов";
        post.subscription = true;
        post.birthday = new FormDate();
        post.birthday.day = 22;
        post.birthday.month = 6;
        post.birthday.year = 1983;
    }

}
