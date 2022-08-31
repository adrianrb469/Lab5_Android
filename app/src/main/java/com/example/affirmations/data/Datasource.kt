package com.example.affirmations.data

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.example.affirmations.R
import com.example.affirmations.model.Affirmation
import com.example.affirmations.model.Anime

class Datasource() {

    fun loadAnime(): List<Anime> {

        return listOf<Anime>(
            Anime("Bungou Stray Dogs","https://i.pinimg.com/736x/c9/a0/df/c9a0dfbe434a10f353d150d20f8848e6.jpg"),
            Anime("Ranking of Kings", "https://cdn.vox-cdn.com/thumbor/MjJbzaM_tDuLk3SmQ18xlFnXOuE=/0x0:1400x700/1200x675/filters:focal(574x113:798x337)/cdn.vox-cdn.com/uploads/chorus_image/image/70690090/KG_pv1_still_002.6.jpg"),
            Anime("Death Note","https://sm.ign.com/t/ign_latam/screenshot/default/death-note_4h2e.h720.jpg"),
            Anime("Demon Slayer", "https://alfabetajuega.com/hero/2021/08/Demon-Slayer-pord.jpg?width=768&aspect_ratio=16:9&format=nowebp"),
            Anime("One Punch Man", "https://static.wikia.nocookie.net/onepunchman/images/8/82/Saitama_Manga.png/revision/latest?cb=20220825051134")
        )
    }
}
