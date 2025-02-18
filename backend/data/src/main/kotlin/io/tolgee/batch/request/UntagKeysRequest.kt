package io.tolgee.batch.request

import javax.validation.constraints.NotEmpty

class UntagKeysRequest {
  @NotEmpty
  var keyIds: List<Long> = listOf()

  @NotEmpty
  var tags: List<String> = listOf()
}
