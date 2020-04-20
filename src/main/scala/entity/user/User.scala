package entity.user

import entity.account.Account
import entity.article.Article

final case class User(id: User.ID, nickname: String, articles: Set[Article.ID], accountID: Account.ID)

object User {
  type ID = entity.ID
}
