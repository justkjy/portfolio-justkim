import com.juskim.portfolio.domain.entity.BaseEntity
import jakarta.servlet.http.HttpServletRequest


@Entity
class HttpInterface(httpServletRequest: HttpServletRequest) : BaseEntity() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "http_interface_id")
    var id:Long? = null
}