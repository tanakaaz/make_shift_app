# make_shift_app
シフト作成WEBアプリ

Thymeleaf メモ
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

model.addAttribute("message","mictest");
th:text="${message}"
