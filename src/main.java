public class main {
    public static void main(String[] args)
    {
        SayaTubeVideo vid1 = new SayaTubeVideo("Review film Spiderman No Way Home oleh Naufal");
        SayaTubeVideo vid2 = new SayaTubeVideo("Review film Jujutsu no Kaisen 0 oleh Naufal");
        SayaTubeVideo vid3 = new SayaTubeVideo("Review film Peaky Blinder oleh Naufal");
        SayaTubeVideo vid4 = new SayaTubeVideo("Review film Hellboy oleh Naufal");
        SayaTubeVideo vid5 = new SayaTubeVideo("Review film Stand By Me Doraemon oleh Naufal");
        SayaTubeVideo vid6 = new SayaTubeVideo("Review film Dr.Strange oleh Naufal");
        SayaTubeVideo vid7 = new SayaTubeVideo("Review film Avengers : End Game oleh Naufal");
        SayaTubeVideo vid8 = new SayaTubeVideo("Review film Captain Marvel oleh Naufal");
        SayaTubeVideo vid9 = new SayaTubeVideo("Review film Iron Man oleh Naufal");
        SayaTubeVideo vid10 = new SayaTubeVideo("Review film Batman oleh Naufal");
        vid1.IncreasePlayCount(25000000);
        vid2.IncreasePlayCount(25000000);
        vid3.IncreasePlayCount(25000000);
        vid4.IncreasePlayCount(25000000);
        vid5.IncreasePlayCount(25000000);
        vid6.IncreasePlayCount(25000000);
        vid7.IncreasePlayCount(25000000);
        vid8.IncreasePlayCount(25000000);

        //try exception
        vid9.IncreasePlayCount(25000000);
        vid10.IncreasePlayCount(25000000);


        SayaTubeUser user1 = new SayaTubeUser("Naufal");
        user1.AddVideo(vid1);
        user1.AddVideo(vid2);
        user1.AddVideo(vid3);
        user1.AddVideo(vid4);
        user1.AddVideo(vid5);
        user1.AddVideo(vid6);
        user1.AddVideo(vid7);
        user1.AddVideo(vid8);
        user1.AddVideo(vid9);
        user1.AddVideo(vid10);

        user1.PrintAllVideoPlaycount();
        System.out.println("Total playcount : "+user1.GetTotalVideoPlayCount());

        //try exception
        for(int i = 0; i<85;i++){
            vid1.IncreasePlayCount(25000000);
        }
        System.out.println("Total playcount : "+user1.GetTotalVideoPlayCount());
        try {
            SayaTubeVideo vid11 = new SayaTubeVideo("");
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            SayaTubeUser vid11 = new SayaTubeUser("");
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            SayaTubeVideo vid11 = new SayaTubeVideo("a");
            vid11.IncreasePlayCount(-5);
        } catch (Exception e) {
            System.out.println(e);
        }
        for(int i = 0; i<85;i++){
            vid1.IncreasePlayCount(25000000);
        }
        System.out.println("Total playcount : "+user1.GetTotalVideoPlayCount());
        try {
            SayaTubeVideo vid11 = new SayaTubeVideo("");
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            SayaTubeUser vid11 = new SayaTubeUser("");
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            SayaTubeVideo vid11 = new SayaTubeVideo("a");
            vid11.IncreasePlayCount(-5);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
