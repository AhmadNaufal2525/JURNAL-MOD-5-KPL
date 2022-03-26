import java.util.Random;
public class SayaTubeVideo {
    private int id;
    private String title;
    private int playCount;

    public SayaTubeVideo(String title) {
        if(title == "" || title == null || title.length() >= 200 ) {
            throw new IllegalArgumentException("Title tidak boleh kosong atau null ! dan Title tidak boleh lebih dari 200 karakter");
        }

        Random random = new Random();
        this.title = title;
        this.id = random.nextInt(100000);
        this.playCount = 0;
    }

    public void IncreasePlayCount(int i) {
        if(i > 25000000) {
            throw new IllegalArgumentException("Penambahan Play Count Maksimal 25.000.000");
        }
        try {
            int x = this.playCount + i;
            if (x < 0) {
                throw new Exception("Nilai Integer sudah maksimal");
            }
            this.playCount += i;
        }
        catch (Exception exception) {
            System.out.print("Gagal menambahkan view" + exception);
        }
    }

    public void PrintVideoDetails() {
        System.out.println("Id : " + id);
        System.out.println("Title : " + title);
        System.out.println("PlayCount : " + playCount);
    }

    public int GetPlayCount() {
        return this.playCount;
    }

    public String GetTitle() {
        return this.title;
    }
}
