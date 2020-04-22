package entity.article

case class Text(id: Text.ID, text: Text, kind: TextKind)

object Text {
  type ID = entity.ID
}