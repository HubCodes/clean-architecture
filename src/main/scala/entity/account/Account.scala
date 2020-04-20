package entity.account

import java.time.LocalDateTime

final case class Account(id: Account.ID, loginPolicy: LoginPolicy, createdAt: LocalDateTime, modifiedAt: LocalDateTime)

object Account {
  type ID = entity.ID
}
