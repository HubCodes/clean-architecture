package entity.article

import java.time.LocalDateTime

import entity.user.User

final case class Article(
  id: Article.ID,
  title: String,
  author: User.ID,
  content: String,
  attachments: Set[Attachment.ID],
  createdAt: LocalDateTime,
  modifiedAt: LocalDateTime)

object Article {
  type ID = entity.ID
}
