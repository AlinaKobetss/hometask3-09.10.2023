--Создать таблицу комментариев (comments) с использованием механизма валидации данных в SQL

create table comments(
	id int primary key auto_increment,
    author_id int not null,
    track_id int not null,
	comment_text text not null,
	created_at timestamp default current_timestamp,
    foreign key (track_id) references tracks(id)
)

--Добавить в таблицу комментариев несколько записей

insert into comments (author_id, track_id, comment_text)
values
(3,1,"The melody of this song is incredibly catchy and uplifting, making it impossible not to tap your feet along with the rhythm. It's a perfect feel-good anthem!"),
(2,3,"The lyrics of this song are incredibly profound and thought-provoking, weaving a beautiful narrative that resonates deeply with the listener. It's a true masterpiece of storytelling through music."),
(1,3,"The singer's voice sounds monotone and devoid of emotion, failing to convey any sincerity or passion, making this song dull and unexpressive."),
(1,2,"The singer's vocals are absolutely mesmerizing, conveying raw emotion and sincerity that truly captivates the listener. Each note feels like it's sung straight from the heart."),
(4,2, "This track is full of clichés and lacks originality. The lyrics carry no depth, and the music sounds like a worn-out melody from the 90s.")

--Вывести количество комментариев на каждый трек (в упорядоченном виде)

select
count(comments.id) AS count_comments
from comments
join tracks on tracks.id = comments.track_id
group by comments.track_id