package kz.h2h.H2H.components.post.model;


import kz.h2h.H2H.components.post.comment.model.Comment;
import kz.h2h.H2H.components.user.model.User;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class Post {
    @Id
    @GeneratedValue
    private Long id;

    @NonNull
    private String title;

    @NonNull
    private String text;

    @NonNull
    private LocalDate date;
    @NonNull
    @OneToOne
    private User user;

    @OneToMany
    @NonNull
    private List<Comment> comments;

    private boolean isModerated = false;

}
