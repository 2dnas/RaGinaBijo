package com.example.raginabijo

object Level1Questions {
    const val CORRECT_ANSWERS = "correct_answers"
    const val TOTAL_QUESTION = "total_questions"

    fun getQuestions (): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val question1 : Question = Question(
            1,
            "რამდენი უნდა აურბენინოს ბონდომ კალდუნას?",
            R.drawable.kalduna,
            "50",
            "100",
            "150",
            "100+50",
            4
        )
        questionsList.add(question1)

        val question2 : Question = Question(
            2,
            "ვინ გადაიღო ქართული ცნობილი ფილმი გზააბნეულნი?",
            R.drawable.gzaabneulni,
            "ერმალო მაღრაძე",
            "ვისკი სკორსეზე",
            "კვენტინ კარანტინო",
            "აკირა კურსორავა",
            1
        )
        questionsList.add(question2)

        val question3 : Question = Question(
            3,
            "როდის ჩამოეთესლა ბონდო?",
            R.drawable.bondo,
            "შარშან",
            "გუშინ",
            "ხვალ",
            "გუშინ-წინ",
            2
        )
        questionsList.add(question3)

        val question4 : Question = Question(
            4,
            "რატომ სვამს ბექა?", 
            R.drawable.beqa,
            "რომ დათვრეს",
            "რომ იცეკვოს",
            "რომ გაექცეს ამ ცხოვრებას",
            "რომს სვავს",
            3
        )
        questionsList.add(question4)

        val question5 : Question = Question(
            5,
            "რის ფილიალს ტეხავენ ბადრი და დათო ფილმში გზააბნეულნი?",
            R.drawable.badridato,
            "ნივიორკის",
            "თბილისის",
            "ხაშურის",
            "ბოსტონის",
            4
        )
        questionsList.add(question5)

        val question6 : Question = Question(
            6,
            "რის ფსიქოლოგიაზე მოგვითხრობს მერაბ კაჭარავას ცნობილი ფილმი?",
            R.drawable.mglis_fsiqologia,
            "ადამიანის",
            "დინოზავრის",
            "მგლის",
            "ფოცხვერის",
            3
        )

        questionsList.add(question6)

        val question7 : Question = Question(
            7,
            "რა უთახთახებს შურიკას ბეჭედის ყიდვის დროს?",
            R.drawable.shurikadadimitri,
            "გული",
            "პროჭი",
            "ფეხები",
            "ტრაკი",
            2
        )
        questionsList.add(question7)

        val question8 : Question = Question(
            8,
            "ვათ ვანთ ერმალო ვიზ სილვესტერ სტალონე?",
            R.drawable.ermalo,
            "დენსინგ ",
            "რანინგ",
            "ფილმინგ",
            "ჯამპინგ",
            3
        )
        questionsList.add(question8)

        val question9 : Question = Question(
            9,
            "რას ეუბნება კალდუნა ქეთო მასწავლებელს?",
            R.drawable.kaldunapajare,
            "ჩაგაბარებთ გაკვეთილს",
            "ცხრიანი რატო მას?",
            "დავალებებს არ შეამოწმებთ?",
            "ერთი წუთი პაჟარე რა ქეთო მას?",
            4
        )
        questionsList.add(question9)

        val question10 : Question = Question(
            10,
            "აირჩიეთ ანტაგონისტის სახელი",
            R.drawable.treroza,
            "ტრეზორა",
            "კოშკა",
            "ბალუ",
            "გიურზა",
            1
        )
        questionsList.add(question10)
        return questionsList
    }
}