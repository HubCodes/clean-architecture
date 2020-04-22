package entity.article

sealed abstract class ProgrammingLanguage

case object C extends ProgrammingLanguage
case object Java extends ProgrammingLanguage
case object Python extends ProgrammingLanguage
