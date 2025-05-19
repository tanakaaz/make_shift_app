# make_shift_app
シフト作成WEBアプリ

Thymeleaf メモ
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

model.addAttribute("message","mictest");
th:text="${message}"

DB系のメモ
docker-compose up -d
docker ps
docker exec -it postgres-container psql -U postgres -d appdb
\dt

(end)が出たらqを押す
コンテナ名　＝　postgres-container
ユーザ名　　＝　postgres
データベース名 = appdb
表名　＝　appdb