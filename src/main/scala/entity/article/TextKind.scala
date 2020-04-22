package entity.article

sealed abstract class TextKind

case object Markdown extends TextKind
case object Plain extends TextKind
case class Code(language: ProgrammingLanguage) extends TextKind
