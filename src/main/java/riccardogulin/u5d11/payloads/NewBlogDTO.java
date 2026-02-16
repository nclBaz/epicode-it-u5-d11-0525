package riccardogulin.u5d11.payloads;

import java.util.UUID;

public record NewBlogDTO(String title,
                         String content,
                         String category,
                         UUID authorId) {
}
