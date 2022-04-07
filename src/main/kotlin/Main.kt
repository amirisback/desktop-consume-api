import com.frogobox.coreapi.ConsumeApiResponse
import com.frogobox.coreapi.news.CNewsApi
import com.frogobox.coreapi.news.NewsConstant
import com.frogobox.coreapi.news.NewsUrl
import com.frogobox.coreapi.news.response.ArticleResponse

fun main(args: Array<String>) {

    CNewsApi(false, NewsUrl.API_KEY).getTopHeadline( // Adding Base Parameter on main function
        null,
        null,
        NewsConstant.CATEGORY_HEALTH,
        NewsConstant.COUNTRY_ID,
        null,
        null,
        object : ConsumeApiResponse<ArticleResponse> {
            override fun onSuccess(data: ArticleResponse) {
                for (i in data.articles?.indices!!) {
                    println("${i + 1}.\t ${data.articles?.get(i)?.title}")
                }
            }

            override fun onFailed(statusCode: Int, errorMessage: String?) {
                // Your failed to do
                println("Failed")
            }

            override fun onShowProgress() {
                // Your Progress Show
                println("Show Progress")
            }

            override fun onHideProgress() {
                // Your Progress Hide
                println("Hide Progress")
            }

        })
}