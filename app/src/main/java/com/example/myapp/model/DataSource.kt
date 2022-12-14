package com.example.myapp.model

import com.example.myapp.model.PersonalData

class DataSource {
    companion object {

        fun createDataSet(): ArrayList<PersonalData>{

            val list = ArrayList<PersonalData>()

            list.add(
                PersonalData(
                    "Naruto",
                    "+01(01)00001-0001",
                    "001.001.001-01",
                    "naruto@hotmail.com",
                    "https://f.i.uol.com.br/fotografia/2021/02/18/1613671083602eaaab101f1_1613671083_3x2_md.jpg",
                )
            )

            list.add(
                PersonalData(
                    "Sasuke",
                    "+02(02)00002-0002",
                    "002.002.002-02",
                    "Sasuke@hotmail.com",
                    "http://pm1.narvii.com/6682/1ab55f2456165ce3d6a52a6a5dd76bb72383cff0_00.jpg",
                )
            )

            list.add(
                PersonalData(
                    "Sakura",
                    "+03(03)00003-0003",
                    "003.003.003-03",
                    "sakura@hotmail.com",
                    "https://uploads.spiritfanfiction.com/historias/capas/202206/se-eu-fosse-sakura-haruno-23977017-150620220725.jpg",
                )
            )

            list.add(
                PersonalData(
                    "Naruto",
                    "+01(01)00001-0001",
                    "001.001.001-01",
                    "naruto@hotmail.com",
                    "https://f.i.uol.com.br/fotografia/2021/02/18/1613671083602eaaab101f1_1613671083_3x2_md.jpg",
                )
            )

            list.add(
                PersonalData(
                    "Sasuke",
                    "+02(02)00002-0002",
                    "002.002.002-02",
                    "Sasuke@hotmail.com",
                    "http://pm1.narvii.com/6682/1ab55f2456165ce3d6a52a6a5dd76bb72383cff0_00.jpg",
                )
            )

            list.add(
                PersonalData(
                    "Sakura",
                    "+03(03)00003-0003",
                    "003.003.003-03",
                    "sakura@hotmail.com",
                    "https://uploads.spiritfanfiction.com/historias/capas/202206/se-eu-fosse-sakura-haruno-23977017-150620220725.jpg",
                )
            )

            list.add(
                PersonalData(
                    "Naruto",
                    "+01(01)00001-0001",
                    "001.001.001-01",
                    "naruto@hotmail.com",
                    "https://f.i.uol.com.br/fotografia/2021/02/18/1613671083602eaaab101f1_1613671083_3x2_md.jpg",
                )
            )

            list.add(
                PersonalData(
                    "Sasuke",
                    "+02(02)00002-0002",
                    "002.002.002-02",
                    "Sasuke@hotmail.com",
                    "http://pm1.narvii.com/6682/1ab55f2456165ce3d6a52a6a5dd76bb72383cff0_00.jpg",
                )
            )

            list.add(
                PersonalData(
                    "Sakura",
                    "+03(03)00003-0003",
                    "003.003.003-03",
                    "sakura@hotmail.com",
                    "https://uploads.spiritfanfiction.com/historias/capas/202206/se-eu-fosse-sakura-haruno-23977017-150620220725.jpg",
                )
            )

         return list
        }
    }
}