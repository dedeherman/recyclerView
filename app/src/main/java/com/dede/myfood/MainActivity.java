package com.dede.myfood;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> fotoMakanan = new ArrayList<>();
    private ArrayList<String> namaMakanan = new ArrayList<>();
    private ArrayList<String> infoMakanan = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getDataFromInternet();

    }

    private void prosesRecyclerViewAdapter(){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(fotoMakanan, namaMakanan, infoMakanan, this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void getDataFromInternet(){

        namaMakanan.add("Awug");
        fotoMakanan.add("https://makananoleholeh.com/wp-content/uploads/2017/05/Awug-Khas-Sunda.jpg");
        infoMakanan.add("Salah satu makanan tradisional Sunda yang sudah ada sejak dulu tapi masih dicari hingga saat ini adalah awug.\n" +
                "\n" +
                "Makanan tradisional ini tergolong ke dalam camilan. Pada saat itu, awug dimakan oleh masyarakat Sunda sebagai teman santai bersama secangkir teh hangat.\n" +
                "\n" +
                "Jajanan bernama unik ini dibuat dari tepung beras, kelapa, daun pandan, dan gula merah.\n" +
                "\n" +
                "Dari tampilan, awug mirip dengan kue putu. Bedanya, jika kue putu dikukus dalam potongan bambu kecil, awug dikukus dalam wadah berbentuk gunungan lancip yang terbuat dari anyaman bambu.\n" +
                "\n" +
                "Lihat juga makanan khas daerah\n" +
                "\n" +
                "Gunungan lancip yang mirip tumpeng itu disebut dengan aseupan oleh orang Sunda. Aseupan yang sudah berisikan adonan kemudian disimpan di dalam dandang hingga adonan benar-benar matang.\n" +
                "\n" +
                "Kalau sudah matang, awug pun jadi dan siap dihidangkan bersama parutan kelapa muda. Awug paling pas dinikmati saat masih hangat karena teksturnya masih legit dan rasanya manis.\n" +
                "\n" +
                "Beda kalau sudah dingin awug biasanya akan sedikit mengeras. Penyajian awug biasanya dilakukan di atas alas berupa daun pisang.");

        namaMakanan.add("Kadedemes");
        fotoMakanan.add("https://makananoleholeh.com/wp-content/uploads/2017/05/Kadedemes-Khas-Sunda.jpg");
        infoMakanan.add("Orang-orang terdahulu memang sangat kreatif dalam memanfaatkan alam.\n" +
                "\n" +
                "Sesuatu yang saat ini sudah dianggap tidak penting ternyata oleh orang-orang zaman dulu masih diolah untuk berbagai kebutuhan, termasuk membuat makanan.\n" +
                "\n" +
                "Salah satu makanan yang dibuat dari bahan dasar yang dianggap orang-orang modern tidak bermanfaat adalah kadedemes.\n" +
                "\n" +
                "Kadedemes adalah makanan makanan khas Sunda yang dibuat dari bahan utama berupa kulit singkong.\n" +
                "\n" +
                "Unik dan kreatif bukan? Kulit singkong yang sudah tidak terpakai diambil bagian dalamnya yang berwarna putih atau agak merah muda. Daging dalam kulit singkong dicuci bersih sebelum diolah.\n" +
                "\n" +
                "Setelah dicuci, bagian dalam tersebut direbus dan ditiriskan. Setelah kering, hasil rebusan dicampur ke dalam bumbu tumis. Kalau sudah, kadedemes bisa langsung dimakan dengan nasi hangat adn ikan asin.");

        namaMakanan.add("Angeun Lompong");
        fotoMakanan.add("https://makananoleholeh.com/wp-content/uploads/2017/05/Angeun-Lompong-Khas-Sunda.jpg");
        infoMakanan.add("Dikarenakan terlalu banyak kuliner yang dimiliki oleh suku Sunda, maka tak sedikit yang mengalami defisit eksistensi akibat kurangnya pengenalan dari generasi terdahulu ke generasi-generasi penerusnya.\n" +
                "\n" +
                "Salah satu makanan khas Sunda yang mulai langka itu adalah angeun lompong. Angeun lompong ini adalah panganan berbentuk sayur yang sangat cocok disantap oleh vegetarian atau penyuka sayur, maupun bukan.\n" +
                "\n" +
                "Lompong dalam bahasa Sunda merujuk pada tanaman talas, atau tepatnya batang talas.\n" +
                "\n" +
                "Selain enak dijadikan sebagai keripik, batang talas ternyata juga bisa dimasak berkuah sebagai lauk pendamping untuk menyantap nasi.\n" +
                "\n" +
                "Tapi sayangnya, makanan tradisional yang satu ini sudah mulai sulit dijumpai, baik di restoran-restoran besar ataupun rumah-rumah makan sederhana di daerah Sunda.");

        namaMakanan.add("Cungkring");
        fotoMakanan.add("https://makananoleholeh.com/wp-content/uploads/2017/05/Cungkring-Khas-Sunda.jpg");
        infoMakanan.add("Kuliner satu ini mempunyai nama yang unik dan membuat orang-orang bertanya mengenainya.\n" +
                "\n" +
                "Kalau kamu sendiri belum tahu, cungkring merupakan makanan khas Sunda yang berbentuk sate. Sate ini dinamakan cungkring karena yang dijadikan sate adalah kulit sapi, kikil, dan daging hidup sapi.\n" +
                "\n" +
                "Di daerah Solo, cungkring mirip dengan sate kere. Cungkring ini merupakan kuliner yang sudah ada sejak zaman dahulu.\n" +
                "\n" +
                "Cungkring pada umumnya dihidangkan bersama lontong dan bumbu kacang dengan menggunakan pincuk daun pisang.\n" +
                "\n" +
                "Kalau ingin kenyang, makanan ini bisa disantap dengan nasi ketan putih yang dicampur dengan kelapa parut dan oncom goreng tepung.\n" +
                "\n" +
                "Cungkring paling enak kalau dimakan saat masih hangat. Teksturnya yang kenyal dengan cita rasanya yang luar biasa akan membuat siapa pun ketgihan saat menyantapnya.");

         namaMakanan.add("Bapatong");
         fotoMakanan.add("https://makananoleholeh.com/wp-content/uploads/2017/05/Bapatong-Khas-Sunda.jpg");
         infoMakanan.add("Apa itu bapatong? Makanan dengan nama aneh dan unik ini adalah singkatan dari gabungan kata Baso Kupat Gentong.\n" +
                 "\n" +
                 "Baso Kupat Gentong adalah makanan yang wajib dicoba oleh setiap wisatawan yang datang ke kota Bogor.\n" +
                 "\n" +
                 "Baso Kupat Gentong sendiri merupakan nama spot kuliner terkenal di Bogor yang menyajikan kupat dengan bakso dan kuah yang sangat menggugah selera.\n" +
                 "\n" +
                 "Tempat makan yang menyajikan berbagai kuliner khas Bogor ini bisa ditemui di Jl. Pangrango No. 1, Bogor.\n" +
                 "\n" +
                 "Kupat atau ketupat yang dihidangkan biasanya tersaji bersama bahan pelengkap lain seperti daging dan bakso.\n" +
                 "\n" +
                 "Tekstur bakso yang dimiliki sangat lembut dan berpadu dengan cita rasa daging yang enak dan segarnya kuah ketika disantap dalam keadaan hangat akan membuat siapa pun betah membuatnya berlama-lama di dalam mulut.\n" +
                 "\n" +
                 "Selain baso kupat gentong, kamu juga bisa menemukan menu lain di Bapatong seperti baso kuah, baso BBQ, dan mie ayam.");

         namaMakanan.add("Misro");
         fotoMakanan.add("https://makananoleholeh.com/wp-content/uploads/2017/05/Misro-Khas-Sunda.jpg");
         infoMakanan.add("Combro dan misro adalah makanan yang tidak bisa dipisahkan. Jika sebelumnya ada combro, maka pada poin ini ada misro yang juga termasuk makanan khas Sunda.\n" +
                 "\n" +
                 "Misro juga sama seperti combro di mana bahan baku utamanya adalah parutan singkong yang digunakan untuk membalut isiannya.\n" +
                 "\n" +
                 "Jika pada combro parutan kelapa dipakai untuk membungkus oncom, maka pada misro parutan kelapanya digunakan untuk membungkus gula merah.\n" +
                 "\n" +
                 "Perbedaan lain antara combro dan misro adalah dari bentuknya. Jika misro biasanya dibentuk memanjang, kalau misro dibuat bulat pipih.\n" +
                 "\n" +
                 "Untuk diketahui, nama misro sendiri merupakan singkatan dari amis di jero yang berarti manis di dalam.\n" +
                 "\n" +
                 "Misro paling enak dimakan dalam keadaan hangat ketika gula merahnya masih cair. Makanan ini biasanya disantap bersama dengan combro.\n" +
                 "\n" +
                 "Misro akan dimakan untuk menghilangkan rasa pedas yang disebabkan oleh combro.");

         namaMakanan.add("Combro");
         fotoMakanan.add("https://makananoleholeh.com/wp-content/uploads/2017/05/Combro-Khas-Sunda.jpg");
         infoMakanan.add("Combro adalah kuliner yang berasal dari Jawa Barat. Makanan satu ini tergolong sebagai makanan ringan yang meskipun sederhana, tapi mempunyai banyak penggemar.\n" +
                 "\n" +
                 "Tak heran jika combro saat ini bisa ditemui di kota-kota lain di luar Jawa Barat. Selain enak, combro ternyata memiliki nilai lebih yang tidak bisa didefinisikan dengan kata-kata oleh sebagian orang yang telah mencobanya.\n" +
                 "\n" +
                 "Di surabaya cukup banyak juga yang mencari oleh-oleh salah satu yang terkenal sebagai oleh oleh khas surabaya adalah Kue Bikang Peneleh.\n" +
                 "\n" +
                 "Makanan ini diberi nama combro karena merupakan singkatan dari “oncom di jero” atau “oncom di dalam”.\n" +
                 "\n" +
                 "Dari pemilihan namanya, sudah bisa ditebak kalau makanan ini menyajikan oncom yang dibalut dengan sesuatu.\n" +
                 "\n" +
                 "Sesuatu tersebut adalah ubi atau singkong yang dibentuk sehingga bisa menutupi keseluruhan isiannya.\n" +
                 "\n" +
                 "Selain diisi dengan oncom, biasanya orang-orang juga menambahkan cabai awit utuh agar bisa lebih menggugah selera saat dimakan.");

         namaMakanan.add("Lepet");
         fotoMakanan.add("https://makananoleholeh.com/wp-content/uploads/2017/05/Lepet-Khas-Sunda.jpg");
         infoMakanan.add("Makanan ini biasa dipanggil lepet di tanah Jawa dan leupeut di tanah Sunda. Lepet sendiri merupakan panganan yang dibuat dari bahan baku beras ketan yang dicampur dengan kacang.\n" +
                 "\n" +
                 "Campuran kedua bahan tadi akan dimasak dalam santan yang kemudian dibungkus menggunakan daun janur hampir kering.\n" +
                 "\n" +
                 "Lepet yang sudah matang bisa langsung disantap begitu sebagai kudapan untuk mengisi perut yang tengah kelaparan.\n" +
                 "\n" +
                 "Makanan khas Sunda satu ini sekilas mirip dengan lontong. Bedanya, lepet lebih padat dan lengket dibanding lontong karena menggunakan bahan dasar berupa ketan.\n" +
                 "\n" +
                 "Selain itu, rasa dari lepet juga lebih gurih karena dicampur dengan santan dan kacang. Di wilayah Sunda, orang-orang biasanya menyantap lepet bersama dengan tahu sumedang.");

         namaMakanan.add("Colenak");
         fotoMakanan.add("https://makananoleholeh.com/wp-content/uploads/2017/05/Colenak-Khas-Sunda.jpg");
         infoMakanan.add("Colenak adalah makanan yang menjadi kebanggaan urang Sunda. Panganan yang lahir melalui kreatifitas penduduk Jawa Barat ini terbuat dari kombinasi tape singkong yang dibakar dengan saus gula atau kinca.\n" +
                 "\n" +
                 "Tape singkong atau peyeum mempunyai rasa manis dan aroma yang wangi ketika dipanggang.\n" +
                 "\n" +
                 "Tape singkong yang sudah dibakar akan disajikan dengan kinca atau saus gula yang umumnya dibuat dari gula aren dan kelapa parut.\n" +
                 "\n" +
                 "Colenak sendiri paling sering dimakan sebagai kudapan. Waktu yang tepat untuk menyantap colenak adalah ketika cuaca sedang dingin atau di sore hari biasanya.\n" +
                 "\n" +
                 "Saat merasakan kelezatan colenak, jangan lupa untuk menyediakan minuman yang bisa menurunkan padatnya tape singkong agar lebih mudah melewati tenggorokan untuk diolah.\n" +
                 "\n" +
                 "Untuk diketahui, colenak merupakan panganan sederhana yang mengandung cukup banyak gizi, seperti protein, karbohidrat, kalsium, fosfor, dan vitamin B1. Selain itu, colenak juga termasuk rendah lemak dan kalori.");

         namaMakanan.add("Cireng, Cimol, dan Cilok");
         fotoMakanan.add("https://makananoleholeh.com/wp-content/uploads/2017/05/Cireng-Khas-Sunda.jpg");
         infoMakanan.add("Cireng merupakan singkatan dari “aci digoreng”. Dari namanya, sudah bisa ditebak kalau makanan ini berbentuk gorengan.\n" +
                 "\n" +
                 "Aci sendiri merupakan panganan yang dibuat dari bahan dasar tepung sagu. Hanya tepung sagu, tidak ada yang lain. Tepung sagu yang dibuat menjadi cireng biasanya dibentuk bulat-bulat untuk kemudian digoreng.\n" +
                 "\n" +
                 "Saat ini, cireng mulai dimodifikasi dengan diberikan berbagai macam isain seperti sosis, ayam, kornet, abon, bakso, dan lain-lain.\n" +
                 "\n" +
                 "Sedangkan cimol adalah singkatan dari “aci digemol”. Aci yang dibuat dari bahan dasar sagu dibentuk bundar-bundar, bukan bulat pipih.\n" +
                 "\n" +
                 "Aci yang sudah dibentuk seperti bola-bola kecil digoreng dengan api kecil hingga matang. Setelah matang, cimol siap disantap bersama bumbu-bumbu kering ataupun basah.\n" +
                 "\n" +
                 "Bumbu kering yang dpakai biasanya berupa bubuk bercita rasa keju, berbeque. Pedas, asin, dan lain-lain. Sedangkan untuk bumbu basah yang paling umum digunakan adalah saus dan kecap.\n" +
                 "\n" +
                 "Olahan aci yang terakhir adalah cilok yang berarti “aci dicolok”. Bentuk dari cilok mirip dengan cimol yakni bulat kecil seperti bola. Yang berbeda dari cilok dan cimol adalah teksturnya.\n" +
                 "\n" +
                 "Kalau cimol bertekstur empuk dan mudah kempes, cilok lebih legit dan kenyal. Agar kenyal, cilok biasanya dibuat dengan mencampurkan tepung terigu an tepung sagu.\n" +
                 "\n" +
                 "Setelah adonan cilok selesai dibuat dan sudah matang digoreng, cilok langsung ditusuk dan dilumuri bumbu kacang.");

        prosesRecyclerViewAdapter();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        // Toast.makeText(this, "profile selected", Toast.LENGTH_LONG).show();

        int id = item.getItemId();

        if (id == R.id.profile) {

            Intent intent = new Intent(MainActivity.this,Profile.class);
            startActivity(intent);
            return true;
        }else{
            return super.onOptionsItemSelected(item);
        }
    }
}