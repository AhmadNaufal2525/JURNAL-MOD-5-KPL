import java.util.ArrayList;
import java.util.Random;

public class SayaTubeUser {
    private int id;
    private ArrayList <SayaTubeVideo> uploadedVideos;
    private String Username;

    public SayaTubeUser(String Username) {
        if(Username == "" || Username == null || Username.length() >= 100){
            throw new IllegalArgumentException("Username tidak boleh kosong atau null dan Username tidak boleh lebih dari 100 karakter");
        }
        Random random = new Random();
        this.uploadedVideos = new ArrayList<SayaTubeVideo>();
        this.Username = Username;
        this.id = random.nextInt(100000);

    }

    public int GetTotalVideoPlayCount() {
        int total = 0;
        for(int i = 0; i<uploadedVideos.size();i++){
            try {
                int x = total + uploadedVideos.get(i).GetPlayCount();
                if(x < 0){
                    throw new Exception("Nilai Integer sudah maksimal");
                }
                total = x;
            } catch (Exception e) {
                System.out.println("Gagal menambahkan view untuk video "+uploadedVideos.get(i).GetTitle()+ " "+e);
            }
        }
        return total;
    }

    public void AddVideo(SayaTubeVideo video) {
        if (video.GetPlayCount() >= Integer.MAX_VALUE){
            throw new IllegalArgumentException("Playcount melebihi batas");
        }
        uploadedVideos.add(video);
    }

    public void PrintAllVideoPlaycount() {
        System.out.println("User : "+this.Username);
        for (int i = 0; i<uploadedVideos.size()&&i<8;i++){
            System.out.printf("Video %d judul : %s\n",i+1,uploadedVideos.get(i).GetTitle());
        }
    }
}
