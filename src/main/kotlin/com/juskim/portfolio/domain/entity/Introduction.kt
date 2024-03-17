import com.juskim.portfolio.domain.entity.BaseEntity
import jakarta.persistence.*
import jakarta.servlet.http.HttpServletRequest

@Entity
class Introduction(
    content: String,
    isActive: Boolean
) : BaseEntity() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Introduction_id")
    var id:Long? = null

    var content : String = content

    var isActive: Boolean = isActive
}