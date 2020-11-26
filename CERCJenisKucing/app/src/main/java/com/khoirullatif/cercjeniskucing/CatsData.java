package com.khoirullatif.cercjeniskucing;

import java.util.ArrayList;

class CatsData {
     private String catTypes[] = new String[]{"Persia Himalaya",
            "Persia Flat Nose",
            "Persia Peak Nose",
            "Persia Medium",
            "American Shorthair",
            "Bengal",
            "British Shorthair",
            "Scottish Fold",
            "Sphynx",
            "Maine Coon",
            "Exotic Shorthair"
};

    private String catDetails[] = new String[]{"Ciri khas kucing Persia Himalaya yaitu bulunya yang sangat tebal dan panjang serta hidung yang tidak terlalu pesek atau datar seperti kucing lain dalam kategori ini. Persia Himalaya dikenal juga dengan sebutan kucing berpola colorpoint karena memiliki warna rambut yang berpola hitam atau coklat kehitaman pada bagian tertentu seperti wajah, ekor, telinga, hidung, dan ujung kaki. Sementara di bagian tubuh lainnya berwarna putih atau coklat muda. Ciri lain dari kucing PersiaHimalaya yaitu bobotnya yang bisa mencapai 4 hingga 6 kg. Bobot ini dianggap cukup besar untuk ukuran kucing.",
            "Sesuai namanya, kucing Persia jenis ini memiliki hidung yang pesek dan kecil. Bahkan, hidungnya nampak sejajar dengan mata. Flat nose juga memiliki bentuk kepala yang sedikit kotak, berbeda dengan kucing jenis lain yang memiliki wajah bulat. Bentuk kepala seperti ini membuat pipi flat nose terlihat lebih chubby atau menggembung. Selain itu, kucing ini juga memiliki bulu yang panjang, badan yang gemuk, dan mata yang kecil. Kupingnya pun meruncing dengan jarak yang agak berjauhan dari satu sama lain. Kucing yang lebih populer di Amerika Selatan ini cenderung aktif dan suka bermain, berbeda dengan Persia Himalaya yang lebih tenang. Flat nose juga suka berlarian, melompat, dan bermain dengan benda-benda yang ada di sekitarnya. Jauh lebih baik bila Anda memiliki tempat yang luas dan menjauhkan benda-benda di rumah dari jangkauan kucing ini. Anda juga perlu hati-hati dalam mengatur porsi makannya. Pasalnya, kucing yang satu ini terbilang suka makan alias rakus jadi rentan terkena obesitas.",
            "Dibandingkan dengan kucing Persia jenis lain, Peak nose memiliki hidung yang paling pesek. Bukan itu saja, harganya pun paling fantastis dibanding jenis lain, yaitu mencapai Rp. 12.000.000! Sekilas, Peak nose memang terlihat mirip dengan Flatnose. Perbedaannya hanya bentuk hidungnya saja yang lebih datar, pesek, dan kecil. Meskipun memiliki hidung yang paling pesek diantara yang lain, Peak nose tidak kalah menggemaskannya. Malah bentuk hidung seperti ini membuat kucing ini nampak unik. Dari segi harga pun wajar saja bila kucing ini memiliki nilai fantastis. Karena, semakin kecil hidung seekor kucing Persia, maka semakin tinggi juga nilai jualnya. Peak nose sendiri terbagi menjadi dua, yaitu Persia Peak nose biasa dan ekstrim. Yang ekstrim tentu saja memiliki hidung yang lebih pesek dari Peaknose biasa.",
            "Bila Kucing Persia Himalaya memiliki hidung yang mancung sedangkan Flatnose dan Peaknose berhidung pesek, kucing jenis ini memiliki bentuk hidung yang ada di tengah-tengah. Artinya, hidungnya tidak terlalu pesek atau terlalu mancung. Rambutnya yang sangat lebat dan panjang dibanding kucing jenis lain menjadi salah satu ciri khas dari Persia Medium. Kucing Persia Medium terbagi menjadi dua jenis, yaitu shorthair yang artinya berbulu pendek dan longhair berbulu panjang. Dari segi perawatan, Medium longhair tentu lebih sulit dan memerlukan perhatian khusus. Sementara itu, harga kucing jenis ini bisa mencapai Rp. 3.000.000 untuk usia dibawah enam bulan, sedangkan untuk yang dewasa bisa mencapai Rp. 8.000.000. Ditilik dari sisi harga, jenis kucing Persia medium lebih murah dibandingkan dengan yang lain.",
            "American Shorthair adalah salah satu ras kucing yang paling disukai karena terkenal dengan bulu berwarna perak yang khas dan corak seperti marmer. Saat ini, terdapat lebih dari 60 jenis warna bulu. Ras Kucing American Shorthair adalah kucing berukuran sedang yang kuat.",
            "Bengal, sering kali dikenal sebagai “macan tutul kecil”, memiliki sifat penuh kasih sayang dan dapat dipangku jika mereka mau, tetapi biasanya mereka lebih suka bermain, mengejar, dan memanjat. Bengal adalah pendamping yang setia dan sabar dengan hewan peliharaan lain di rumah serta anak-anak. Kucing ini percaya diri dan penuh rasa ingin tahu yang selalu menyelidiki. Sebagai kucing yang aktif, penting untuk memastikan bahwa mereka menerima banyak rangsang dan kesempatan untuk berolahraga dan berinteraksi dengan pemiliknya.",
            "British Shorthair adalah kucing berukuran sedang dengan bulu khas yang halus. Mereka kucing yang santai dan mudah untuk dirawat, dan juga mereka adalah salah satu ras kucing yang sangat mandiri. Orang-orang akan sangat menyukainya karena tampilan mereka sangat menggemaskan, namun British Shorthairs sebenarnya memiliki tubuh yang gagah dan kuat",
            "Scottish Fold adalah kucing berukuran sedang dengan bentuk badan yang bulat. Scottish Fold disebut juga “Lop -eared” atau “Lops” karena telinganya mulai terlipat saat bulan pertama nya. Scottish Fold juga sangat penuh kasih sayang dan kucing dengan kualitas yang tinggi.",
            "Kucing sphynx (dahulu bernama Canadian hairless) adalah salah satu ras kucing yang memiliki bulu sangat pendek dan sedikit sekali. Jika dilihat sekilas, kucing sphynx tampak tidak memiliki bulu sama sekali, tetapi jika diamati lebih saksama tubuh kucing ini ditumbuhi rambut halus di beberapa bagian, seperti telinga, kaki, ekor, dan didekat organ kelamin. Kucing sphynx berasal dari Kanada. Namun, penyebarannya dapat ditemukan di beberapa tempat seperti Kanada, Prancis, Maroko, Meksiko, Rusia, Australia dan Amerika Serikat. Kucing ras sphynx merupakan salah satu jenis kucing hasil rekayasa genetik.",
            "Maine coon adalah kucing berbadan besar dan tinggi dengan berat jantan sekitar 6–9 kg dan betina sekitar 4–6 kg. Tubuhnya dapat mencapai ketinggian hingga sekitar 1 meter. Maine coon merupakan kucing yang kuat dan berotot. Kucing ini memiliki pertumbuhan dewasa yang lama, yaitu sekitar 3-5 tahun. Maine coon memiliki kepala yang sedang dan lebar dengan dahi yang sedikit melengkung dan tulang pipi yang menonjol. Matanya besar dan berbentuk seperti oval. Hidungnya lebar dan di bagian ujungnya sedikit melengkung dan dagunya terlihat tajam. Telinganya besar dengan bagian bawahnnya lebar dan dibagian ujungnya lancip. Lehernya kuat dengan panjang yang sedang. Kakinya sedang dengan tulang dan otot yang kuat dan ekornya panjang.",
            "Kucing Exotic Shorthair adalah salah satu jenis kucing memang dikembangan menjadi kucing ras Persia denga versi ukuran bulu yang pendek, sehingga disebut shorthair. Sekilas jenis kucing satu ini memiliki bentuk kemiripan dengan Kucing Persia. Bahkan hingga ke bagian tempramen serta fisiknya. Yang membedakan adalah bentuk bulunya yang pendek. Kucing Exotic Shorthair merupakan ras kucing dari hasil perkawinan antara kucing American Shorthair dengan Kucing Persia. Mengenai bentuk bulunya lebih mengikuti bentuk bulu pada kucing American Shorthair. Untuk Kamu yang ingin memelihara kucing namun tidak mau repot mengurus bagian bulunya, maka jenis kucing satu ini merupakan jenis kucing yang tepat untuk dijadikan pilihan."
    };

    private int[] catImages = new int[]{R.drawable.persia_himalaya,
            R.drawable.persia_flat_nose,
            R.drawable.persia_peak_nose,
            R.drawable.persia_medium,
            R.drawable.american_shorthair,
            R.drawable.bengal,
            R.drawable.british_shorthair,
            R.drawable.scottish_fold,
            R.drawable.sphynx,
            R.drawable.maine_coon,
            R.drawable.exotic_shorthair
};

    private String[] catPrice = new String[]{"Rp3.000.000 – Rp4.000.000",
            "Rp5.000.000 – Rp6.000.000",
            "Rp6.000.000 – Rp12.000.000",
            "Rp2.000.000 – Rp3.000.000",
            "Rp14.000.000 – Rp22.000.000",
            "Rp22.000.000 – Rp44.000.000",
            "Rp17.000.000 – Rp33.000.000",
            "Rp14.000.000 – Rp29.000.000",
            "Rp51.000.000 – Rp88.000.000",
            "Rp5.000.000 – Rp22.000.000",
            "Rp17.500.000 – Rp32.000.000"
    };


    public static ArrayList<Cat> getListData(){
        CatsData catsData = new CatsData();
        ArrayList<Cat> list = new ArrayList<>();
        for (int i=0; i<catsData.catTypes.length; i++){
            Cat cat = new Cat();
            cat.setJenis(catsData.catTypes[i]);
            cat.setDetail(catsData.catDetails[i]);
            cat.setImage(catsData.catImages[i]);
            cat.setHarga(catsData.catPrice[i]);
            list.add(cat);
        }
        return list;
    }

}
