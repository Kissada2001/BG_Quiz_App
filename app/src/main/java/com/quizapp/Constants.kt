package com.quizapp

import com.quizapp.R
import com.quizapp.Question

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()
        val que1 = Question(
            1, "บุคคลในภาพมีชื่อว่าอะไร?",
            R.drawable.ic_quiz_1_1,
            "ประยุทธ์ จันทร์โอชา", "สมเกียรติ อ่อนวิมล",
            "สมโภช สายเทพ", "โกวิทย์ ธารณา", 1
        )
        questionsList.add(que1)

        val que2 = Question(
            2, "บุคคลในภาพมีชื่อว่าอะไร?",
            R.drawable.ic_quiz_1_2,
            "ก่อเกียรติ สิริยะเสถียร", "เจริญ จรรย์โกมล",
            "ประวิตร วงษ์สุวรรณ", "ชนินทร์ รุ่งแสง", 3
        )
        questionsList.add(que2)

        val que3 = Question(
            3, "บุคคลในภาพมีชื่อว่าอะไร?",
            R.drawable.ic_quiz_1_3,
            "ณรงค์กร ชวาลสันตติ", "เชิดชัย วิเชียรวรรณ",
            "จักรกฤษณ์ ทองศรี", "เสก โลโซ", 4
        )
        questionsList.add(que3)

        val que4 = Question(
            4, "บุคคลในภาพมีชื่อว่าอะไร?",
            R.drawable.ic_quiz_1_4,
            "ไตรรงค์ สุวรรณคีรี", "อาทิวราห์ คงมาลัย",
            "ถวิล ไพรสณฑ์", "ธวัชชัย อนามพงษ์", 2
        )
        questionsList.add(que4)
        // 5
        val que5 = Question(
            5, "บุคคลในภาพมีชื่อว่าอะไร?",
            R.drawable.ic_quiz_1_5,
            "นรพล ตันติมนตรี", "นิทัศน์ ศรีนนท์",
            "เฟิร์ส Slot Machine", "นิโรธ สุนทรเลขา", 3
        )
        questionsList.add(que5)
        // 6
        val que6 = Question(
            6, "บุคคลในภาพมีชื่อว่าอะไร?",
            R.drawable.ic_quiz_1_6,
            "สงกรานต์ รังสรรค์", "ประชา ประสพดี",
            "บุญรื่น ศรีธเรศ", "ประพนธ์ นิลวัชรมณี", 1
        )
        questionsList.add(que6)
        // 7
        val que7 = Question(
            7, "บุคคลในภาพมีชื่อว่าอะไร?",
            R.drawable.ic_quiz_1_7,
            "ประเสริฐ บุญชัยสุข", "ปรีชา มุสิกุล",
            "จิมมี่ สุรชัย", "ปวีณ แซ่จึง", 3
        )
        questionsList.add(que7)
        // 8
        val que8 = Question(
            8, "บุคคลในภาพมีชื่อว่าอะไร?",
            R.drawable.ic_quiz_1_8,
            "ปัญญา ศรีปัญญา", "พงษ์ศักดิ์ บุญศล",
            "เผดิมชัย สะสมทรัพย์", "จิ๋ว ปิยนุช", 4
        )
        questionsList.add(que8)
        // 9
        val que9 = Question(
            9, "บุคคลในภาพมีชื่อว่าอะไร?",
            R.drawable.ic_quiz_1_9,
            "พลพีร์ สุวรรณฉวี", "โป่ง ปฐมพงศ์",
            "พฤฒิชัย วิริยะโรจน์", "พรศักดิ์ เจริญประเสริฐ", 2
        )
        questionsList.add(que9)
        // 10
        val que10 = Question(
            10, "บุคคลในภาพมีชื่อว่าอะไร?",
            R.drawable.ic_quiz_1_10,
            "ปู พงษ์สิทธิ์", "พิเชษฐ์ ตันเจริญ",
            "พิษณุ หัตถสงเคราะห์", "พีรพันธุ์ พาลุสุข", 1
        )
        questionsList.add(que10)
        return questionsList
    }
    fun getQuestions2(): ArrayList<Question> {
        val questionsList2 = ArrayList<Question>()
        val que21 = Question(
            1, "บุคคลในภาพมีชื่อว่าอะไร?",
            R.drawable.ic_quiz_2_1,
            "เกี่ยวก้อย ขวัญกวินท์", "กุ๊กกิ๊ก ณฐมน",
            "แทน แทนตะวัน", "บีช สุกฤษฏิ์", 1
        )
        questionsList2.add(que21)

        val que22 = Question(
            2, "บุคคลในภาพมีชื่อว่าอะไร?",
            R.drawable.ic_quiz_2_2,
            "นัท อติรุจ", "กุ๊กกิ๊ก ณฐมน",
            "แทน แทนตะวัน", "แก้ม ญาณิศา", 2
        )
        questionsList2.add(que22)

        val que23 = Question(
            3, "บุคคลในภาพมีชื่อว่าอะไร?",
            R.drawable.ic_quiz_2_3,
            "แทน แทนตะวัน", "เติร์ก ณัฐชนน",
            "พล พูลภัทร", "นัท อติรุจ", 3
        )
        questionsList2.add(que23)

        val que24 = Question(
            4, "บุคคลในภาพมีชื่อว่าอะไร?",
            R.drawable.ic_quiz_2_4,
            "แก้ม ญาณิศา", "มายด์ พัฒนิดา",
            "สา อนิสา", "ปิ่น ชรินพร", 3
        )
        questionsList2.add(que24)
        // 5
        val que25 = Question(
            5, "บุคคลในภาพมีชื่อว่าอะไร?",
            R.drawable.ic_quiz_2_5,
            "เฟิร์น ณัฐชยกานต์", "แก้ม ญาณิศา",
            "พลอย รัญดภา", "ปิ่น ชรินพร", 3
        )
        questionsList2.add(que25)
        // 6
        val que26 = Question(
            6, "บุคคลในภาพมีชื่อว่าอะไร?",
            R.drawable.ic_quiz_2_6,
            "ฝน ปริตา", "นัท อติรุจ",
            "แก้ม ญาณิศา", "ปิ่น ชรินพร", 1
        )
        questionsList2.add(que26)
        // 7
        val que27 = Question(
            7, "บุคคลในภาพมีชื่อว่าอะไร?",
            R.drawable.ic_quiz_2_7,
            "หยก ธัญยกันต์", "วินน์ วาทิต",
            "แอมป์ พีรวัศ", "แทน แทนตะวัน", 3
        )
        questionsList2.add(que27)
        // 8
        val que28 = Question(
            8, "บุคคลในภาพมีชื่อว่าอะไร?",
            R.drawable.ic_quiz_2_8,
            "เติร์ก ณัฐชนน", "แทน แทนตะวัน",
            "วินน์ วาทิต", "ไต้ฝุ่น ตากเพชร", 4
        )
        questionsList2.add(que28)
        // 9
        val que29 = Question(
            9, "บุคคลในภาพมีชื่อว่าอะไร?",
            R.drawable.ic_quiz_2_9,
            "วินน์ วาทิต", "หมู ภูษณะ",
            "เติร์ก ณัฐชนน", "แทน แทนตะวัน", 2
        )
        questionsList2.add(que29)
        // 10
        val que210 = Question(
            10, "บุคคลในภาพมีชื่อว่าอะไร?",
            R.drawable.ic_quiz_2_10,
            "เติ้ล ปิติพน", "วินน์ วาทิต",
            "ดนฐ์ กณิณ", "เติร์ก ณัฐชนน", 1
        )
        questionsList2.add(que210)
        return questionsList2
    }

    fun getQuestions3(): ArrayList<Question> {
        val questionsList3 = ArrayList<Question>()
        val que31 = Question(
            1, "บุคคลในภาพมีชื่อว่าอะไร?",
            R.drawable.ic_quiz_3_1,
            "เฟิร์น ณัฐชยกานต์", "แก้วใส คริสตัล",
            "ตาล กัญญา", "ฟ้า อิงฟ้า", 1
        )
        questionsList3.add(que31)

        val que32 = Question(
            2, "บุคคลในภาพมีชื่อว่าอะไร?",
            R.drawable.ic_quiz_3_2,
            "หยก ธัญยกันต์", "เฟิร์น ฐิตินันท์",
            "จาด้า อินโตร์เร", "คะน้า ริญญารัตน์", 3
        )
        questionsList3.add(que32)

        val que33 = Question(
            3, "บุคคลในภาพมีชื่อว่าอะไร?",
            R.drawable.ic_quiz_3_3,
            "บิ๊ก กฤษฎา", "วินน์ วาทิต",
            "ดนฐ์ กณิณ", "เติร์ก ณัฐชนน", 4
        )
        questionsList3.add(que33)

        val que34 = Question(
            4, "บุคคลในภาพมีชื่อว่าอะไร?",
            R.drawable.ic_quiz_3_4,
            "เฟิร์น ณัฐชยกานต์", "เฟิร์น ฐิตินันท์",
            "โย ปราณวรินทร์", "กิฟท์ สุพิชฌาย์", 2
        )
        questionsList3.add(que34)
        // 5
        val que35 = Question(
            5, "บุคคลในภาพมีชื่อว่าอะไร?",
            R.drawable.ic_quiz_3_5,
            "มายด์ พัฒนิดา", "แก้ม ญาณิศา",
            "หยก ธัญยกันต์", "ปิ่น ชรินพร", 3
        )
        questionsList3.add(que35)
        // 6
        val que36 = Question(
            6, "บุคคลในภาพมีชื่อว่าอะไร?",
            R.drawable.ic_quiz_3_6,
            "วี วีรภาพ", "แทน แทนตะวัน",
            "ไอซ์ นคินธร", "โตส อัครัช", 1
        )
        questionsList3.add(que36)
        // 7
        val que37 = Question(
            7, "บุคคลในภาพมีชื่อว่าอะไร?",
            R.drawable.ic_quiz_3_7,
            "ริส วิชญพงศ์", "ริว ภัทรพงศ์",
            "โน้ต วัชรบูล", "ภูมิ เกียรติภูมิ", 3
        )
        questionsList3.add(que37)
        // 8
        val que38 = Question(
            8, "บุคคลในภาพมีชื่อว่าอะไร?",
            R.drawable.ic_quiz_3_8,
            "ฟีฟ่า เปรมอนันต์", "บีช สุกฤษฏิ์",
            "ฟิล์ม กรรญกฤต", "เอก รังสิโรจน์", 4
        )
        questionsList3.add(que38)
        // 9
        val que39 = Question(
            9, "บุคคลในภาพมีชื่อว่าอะไร?",
            R.drawable.ic_quiz_3_9,
            "ตรัย จักรภัทร", "นัท อติรุจ",
            "ไอซ์ ชณภัส", "ยูโร ยศวรรธน์", 2
        )
        questionsList3.add(que39)
        // 10
        val que310 = Question(
            10, "บุคคลในภาพมีชื่อว่าอะไร?",
            R.drawable.ic_quiz_3_10,
            "น้ำ รพีภัทร", "บอม พงศกร",
            "อ้น ณศรันย์", "โอ๊ต รัฐธีร์", 1
        )
        questionsList3.add(que310)
        return questionsList3
    }

    fun getQuestions4(): ArrayList<Question> {
        val questionsList4 = ArrayList<Question>()
        val que41 = Question(
            1, "เมนูอาหารในภาพมีชื่อว่าอะไร?",
            R.drawable.ic_quiz_4_1,
            "ข้าวผัดกะเพรา", "ข้าวผัดหมู",
            "ข้าวราดคะน้าหมูกรอบ", "ผัดพริกแกง", 1
        )
        questionsList4.add(que41)

        val que42 = Question(
            2, "เมนูอาหารในภาพมีชื่อว่าอะไร?",
            R.drawable.ic_quiz_4_2,
            "ข้าวผัดกะเพรา", "ข้าวราดคะน้าหมูกรอบ",
            "ข้าวผัดหมู", "ผัดซีอิ๊ว", 3
        )
        questionsList4.add(que42)

        val que43 = Question(
            3, "เมนูอาหารในภาพมีชื่อว่าอะไร?",
            R.drawable.ic_quiz_4_3,
            "ผัดผงกะหรี่", "ผัดพริกเผา",
            "ผัดพริกแกง", "ข้าวราดคะน้าหมูกรอบ", 4
        )
        questionsList4.add(que43)

        val que44 = Question(
            4, "เมนูอาหารในภาพมีชื่อว่าอะไร?",
            R.drawable.ic_quiz_4_4,
            "ราดหน้า", "ผัดพริกแกง",
            "ผัดพริกเผา", "ผัดผงกะหรี่", 2
        )
        questionsList4.add(que44)
        // 5
        val que45 = Question(
            5, "เมนูอาหารในภาพมีชื่อว่าอะไร?",
            R.drawable.ic_quiz_4_5,
            "เขียวหวานผัดแห้ง", "ราดหน้า",
            "ผัดซีอิ๊ว", " พะแนงหมู", 3
        )
        questionsList4.add(que45)
        // 6
        val que46 = Question(
            6, "เมนูอาหารในภาพมีชื่อว่าอะไร?",
            R.drawable.ic_quiz_4_6,
            "ราดหน้า", "เขียวหวานผัดแห้ง",
            " พะแนงหมู", "คั่วพริกเกลือ", 1
        )
        questionsList4.add(que46)
        // 7
        val que47 = Question(
            7, "เมนูอาหารในภาพมีชื่อว่าอะไร?",
            R.drawable.ic_quiz_4_7,
            " พะแนงหมู", "เขียวหวานผัดแห้ง",
            "ทอดกระเทียม", "คั่วพริกเกลือ", 3
        )
        questionsList4.add(que47)
        // 8
        val que48 = Question(
            8, "เมนูอาหารในภาพมีชื่อว่าอะไร?",
            R.drawable.ic_quiz_4_8,
            "ข้าวผัดกะเพราโบราณ", "เขียวหวานผัดแห้ง",
            " พะแนงหมู", "ผัดพริกเผา", 4
        )
        questionsList4.add(que48)
        // 9
        val que49 = Question(
            9, "เมนูอาหารในภาพมีชื่อว่าอะไร?",
            R.drawable.ic_quiz_4_9,
            "ข้าวผัดกะเพราโบราณ", "ผัดผงกะหรี่",
            " พะแนงหมู", "เขียวหวานผัดแห้ง", 2
        )
        questionsList4.add(que49)
        // 10
        val que410 = Question(
            10, "เมนูอาหารในภาพมีชื่อว่าอะไร?",
            R.drawable.ic_quiz_4_10,
            "แกงจืดเต้าหู้หมูสับ", "ข้าวผัดกะเพราโบราณ",
            " พะแนงหมู", "เขียวหวานผัดแห้ง", 1
        )
        questionsList4.add(que410)
        return questionsList4
    }

    fun getQuestions5(): ArrayList<Question> {
        val questionsList5 = ArrayList<Question>()
        val que51 = Question(
            1, "อาหารดังรูปต่อไปนี้เป็นอาหารของประเทศใด?",
            R.drawable.ic_quiz_5_1,
            "จีน", "ญี่ปุ่น",
            "อังกฤษ", "ไทย", 4
        )
        questionsList5.add(que51)

        val que52 = Question(
            2, "อาหารดังรูปต่อไปนี้เป็นอาหารของประเทศใด?",
            R.drawable.ic_quiz_5_2,
            "เกาหลี", "จีน",
            "ลาว", "เวียดนาม", 2
        )
        questionsList5.add(que52)

        val que53 = Question(
            3, "อาหารดังรูปต่อไปนี้เป็นอาหารของประเทศใด?",
            R.drawable.ic_quiz_5_3,
            "อังกฤษ", "เกาหลี",
            "บลาซิล", "โปรตุเกส", 1
        )
        questionsList5.add(que53)

        val que54 = Question(
            4, "อาหารดังรูปต่อไปนี้เป็นอาหารของประเทศใด?",
            R.drawable.ic_quiz_5_4,
            "อินเดีย", "เวียดนาม",
            "จีน", "อินโดนีเซีย", 1
        )
        questionsList5.add(que54)
        // 5
        val que55 = Question(
            5, "อาหารดังรูปต่อไปนี้เป็นอาหารของประเทศใด?",
            R.drawable.ic_quiz_5_5,
            "สิงคโปร์", "ไทย",
            "อินโดนีเซีย", "พม่า", 3
        )
        questionsList5.add(que55)
        // 6
        val que56 = Question(
            6, "อาหารดังรูปต่อไปนี้เป็นอาหารของประเทศใด?",
            R.drawable.ic_quiz_5_6,
            "สิงคโปร์", "เวียดนาม",
            "บรูไน", "ไทย", 1
        )
        questionsList5.add(que56)
        // 7
        val que57 = Question(
            7, "อาหารดังรูปต่อไปนี้เป็นอาหารของประเทศใด?",
            R.drawable.ic_quiz_5_7,
            "เวียดนาม", "อินโดนีเซีย",
            "พม่า", "กัมพูชา", 3
        )
        questionsList5.add(que57)
        // 8
        val que58 = Question(
            8, "อาหารดังรูปต่อไปนี้เป็นอาหารของประเทศใด?",
            R.drawable.ic_quiz_5_8,
            "พม่า", "ไทย",
            "ฟิลิปปินส์", "กัมพูชา", 4
        )
        questionsList5.add(que58)
        // 9
        val que59 = Question(
            9, "อาหารดังรูปต่อไปนี้เป็นอาหารของประเทศใด?",
            R.drawable.ic_quiz_5_9,
            "เวียดนาม", "ฟิลิปปินส์",
            "อินโดนีเซีย", "บรูไน", 2
        )
        questionsList5.add(que59)
        // 10
        val que510 = Question(
            10, "อาหารดังรูปต่อไปนี้เป็นอาหารของประเทศใด?",
            R.drawable.ic_quiz_5_10,
            "เวียดนาม", "อินโดนีเซีย",
            "ไทย", "พม่า", 1
        )
        questionsList5.add(que510)
        return questionsList5
    }

    fun getQuestions6(): ArrayList<Question> {
        val questionsList6 = ArrayList<Question>()
        val que61 = Question(
            1, "ขนมหวานดังรูปต่อไปนี้เป็นขนมของปารเทศใด?",
            R.drawable.ic_quiz_6_1,
            "อินโดนีเซีย", "เยอรมัน",
            "อังกฤษ", "ฝรั่งเศส", 4
        )
        questionsList6.add(que61)

        val que62 = Question(
            2, "ขนมหวานดังรูปต่อไปนี้เป็นขนมของปารเทศใด?",
            R.drawable.ic_quiz_6_2,
            "อิตาลี", "ฝรั่งเศส",
            "ตุรกี", "เยอรมัน", 3
        )
        questionsList6.add(que62)

        val que63 = Question(
            3, "ขนมหวานดังรูปต่อไปนี้เป็นขนมของปารเทศใด?",
            R.drawable.ic_quiz_6_3,
            "ฝรั่งเศส", "เยอรมัน",
            "อิตาลี", "เนเธอร์แลนด์", 4
        )
        questionsList6.add(que63)

        val que64 = Question(
            4, "ขนมหวานดังรูปต่อไปนี้เป็นขนมของปารเทศใด?",
            R.drawable.ic_quiz_6_4,
            "ฝรั่งเศส", "อิตาลี",
            "บลาซิล", "ปากีสถาน", 2
        )
        questionsList6.add(que64)
        // 5
        val que65 = Question(
            5, "ขนมหวานดังรูปต่อไปนี้เป็นขนมของปารเทศใด?",
            R.drawable.ic_quiz_6_5,
            "เยอรมัน", "ฝรั่งเศส",
            "อิตาลี", "บลาซิล", 3
        )
        questionsList6.add(que65)
        // 6
        val que66 = Question(
            6, "ขนมหวานดังรูปต่อไปนี้เป็นขนมของปารเทศใด?",
            R.drawable.ic_quiz_6_6,
            "ญี่ปุ่น", "เยอรมัน",
            "บลาซิล", "เกาหลี", 1
        )
        questionsList6.add(que66)
        // 7
        val que67 = Question(
            7, "ขนมหวานดังรูปต่อไปนี้เป็นขนมของปารเทศใด?",
            R.drawable.ic_quiz_6_7,
            "ญี่ปุ่น", "อิตาลี",
            "เดนมาร์ก", "เยอรมัน", 3
        )
        questionsList6.add(que67)
        // 8
        val que68 = Question(
            8, "ขนมหวานดังรูปต่อไปนี้เป็นขนมของปารเทศใด?",
            R.drawable.ic_quiz_6_8,
            "อิตาลี", "เยอรมัน",
            "บลาซิล", "อินเดีย", 4
        )
        questionsList6.add(que68)
        // 9
        val que69 = Question(
            9, "ขนมหวานดังรูปต่อไปนี้เป็นขนมของปารเทศใด?",
            R.drawable.ic_quiz_6_9,
            "เยอรมัน", "อียิปต์ ยุคหินใหม่",
            "เดนมาร์ก", "ปากีสถาน", 2
        )
        questionsList6.add(que69)
        // 10
        val que610 = Question(
            10, "ขนมหวานดังรูปต่อไปนี้เป็นขนมของปารเทศใด?",
            R.drawable.ic_quiz_6_10,
            "อังกฤษ", "เดนมาร์ก",
            "เยอรมัน", "บลาซิล", 1
        )
        questionsList6.add(que610)
        return questionsList6
    }
}