package tr.workshop.persistence

import java.util.UUID
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Thing(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: UUID?,
    var name: String?,
)