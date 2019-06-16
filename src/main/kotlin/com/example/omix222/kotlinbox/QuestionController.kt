package com.example.omix222.kotlinbox


import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("question")
class QuestionController {

    @GetMapping
    fun hello(model: Model): String {
        var result = ArrayList<Question>()
        var question1 = Question(1,"質問1です","回答1です",1,"回答済")
        var question2 = Question(1,"質問2です","回答2です",1,"回答済")
        var question3 = Question(1,"質問3です","回答3です",1,"回答済")
        result.add(question1)
        result.add(question2)
        result.add(question3)
        model.addAttribute("questions", result)
        return "questionlist"
    }
}