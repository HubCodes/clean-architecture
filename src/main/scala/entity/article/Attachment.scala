package entity.article

final case class Attachment(id: Attachment.ID, uri: Attachment.URI)

object Attachment {
  type ID = entity.ID
  type URI = String
}

