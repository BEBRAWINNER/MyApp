package com.example.myapp.errors.presentation

import com.example.myapp.errors.presentation.model.ErrorsUiModel
import com.example.myapp.errors.presentation.model.SeeAlsoModel

object MockData {
    fun getErrors(): List<ErrorsUiModel> = listOf(
        ErrorsUiModel(
            code = "401",
            title = "Unauthorized",
            imageUrl = "https://http.cat/401.jpg",
            description = "Для доступа к ресурсу требуется аутентификация",
            seeAlso = listOf(
                SeeAlsoModel("RFC 9110", "https://httpwg.org/specs/rfc9110.html#status.401"),
                SeeAlsoModel("MDN Web Docs", "https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/401")
            ),
            source = "RFC 7235, Section 3.1"
        ),

        ErrorsUiModel(
            code = "403",
            title = "Forbidden",
            imageUrl = "https://http.cat/403.jpg",
            description = "Сервер понял запрос, но отказывается его авторизовать",
            seeAlso = listOf(
                SeeAlsoModel("RFC 9110", "https://httpwg.org/specs/rfc9110.html#status.403"),
                SeeAlsoModel("MDN Web Docs", "https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/403")
            ),
            source = "RFC 7231, Section 6.5.3"
        ),

        ErrorsUiModel(
            code = "404",
            title = "Not Found",
            imageUrl = "https://http.cat/404.jpg",
            description = "Сервер не может найти запрашиваемый ресурс",
            seeAlso = listOf(
                SeeAlsoModel("RFC 9110", "https://httpwg.org/specs/rfc9110.html#status.404"),
                SeeAlsoModel("MDN Web Docs", "https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/404")
            ),
            source = "RFC 7231, Section 6.5.4"
        ),

        ErrorsUiModel(
            code = "405",
            title = "Method Not Allowed",
            imageUrl = "https://http.cat/405.jpg",
            description = "Метод запроса не поддерживается для данного ресурса",
            seeAlso = listOf(
                SeeAlsoModel("RFC 9110", "https://httpwg.org/specs/rfc9110.html#status.405"),
                SeeAlsoModel("MDN Web Docs", "https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/405")
            ),
            source = "RFC 7231, Section 6.5.5"
        ),

        ErrorsUiModel(
            code = "408",
            title = "Request Timeout",
            imageUrl = "https://http.cat/408.jpg",
            description = "Сервер ожидал запрос в течение установленного времени",
            seeAlso = listOf(
                SeeAlsoModel("RFC 9110", "https://httpwg.org/specs/rfc9110.html#status.408"),
                SeeAlsoModel("MDN Web Docs", "https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/408")
            ),
            source = "RFC 7231, Section 6.5.7"
        ),

        ErrorsUiModel(
            code = "409",
            title = "Conflict",
            imageUrl = "https://http.cat/409.jpg",
            description = "Запрос конфликтует с текущим состоянием сервера",
            seeAlso = listOf(
                SeeAlsoModel("RFC 9110", "https://httpwg.org/specs/rfc9110.html#status.409"),
                SeeAlsoModel("MDN Web Docs", "https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/409")
            ),
            source = "RFC 7231, Section 6.5.8"
        ),

        ErrorsUiModel(
            code = "410",
            title = "Gone",
            imageUrl = "https://http.cat/410.jpg",
            description = "Ресурс больше недоступен на сервере и был удален навсегда",
            seeAlso = listOf(
                SeeAlsoModel("RFC 9110", "https://httpwg.org/specs/rfc9110.html#status.410"),
                SeeAlsoModel("MDN Web Docs", "https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/410")
            ),
            source = "RFC 7231, Section 6.5.9"
        ),

        ErrorsUiModel(
            code = "413",
            title = "Payload Too Large",
            imageUrl = "https://http.cat/413.jpg",
            description = "Тело запроса превышает ограничения, установленные сервером",
            seeAlso = listOf(
                SeeAlsoModel("RFC 9110", "https://httpwg.org/specs/rfc9110.html#status.413"),
                SeeAlsoModel("MDN Web Docs", "https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/413")
            ),
            source = "RFC 7231, Section 6.5.11"
        ),

        ErrorsUiModel(
            code = "414",
            title = "URI Too Long",
            imageUrl = "https://http.cat/414.jpg",
            description = "Длина URI превышает ограничения, которые может обработать сервер",
            seeAlso = listOf(
                SeeAlsoModel("RFC 9110", "https://httpwg.org/specs/rfc9110.html#status.414"),
                SeeAlsoModel("MDN Web Docs", "https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/414")
            ),
            source = "RFC 7231, Section 6.5.12"
        ),

        ErrorsUiModel(
            code = "415",
            title = "Unsupported Media Type",
            imageUrl = "https://http.cat/415.jpg",
            description = "Формат медиа-данных в запросе не поддерживается сервером",
            seeAlso = listOf(
                SeeAlsoModel("RFC 9110", "https://httpwg.org/specs/rfc9110.html#status.415"),
                SeeAlsoModel("MDN Web Docs", "https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/415")
            ),
            source = "RFC 7231, Section 6.5.13"
        ),

        ErrorsUiModel(
            code = "429",
            title = "Too Many Requests",
            imageUrl = "https://http.cat/429.jpg",
            description = "Пользователь отправил слишком много запросов за короткое время",
            seeAlso = listOf(
                SeeAlsoModel("RFC 6585", "https://httpwg.org/specs/rfc6585.html#status-429"),
                SeeAlsoModel("MDN Web Docs", "https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/429")
            ),
            source = "RFC 6585, Section 4"
        ),

        ErrorsUiModel(
            code = "500",
            title = "Internal Server Error",
            imageUrl = "https://http.cat/500.jpg",
            description = "Сервер столкнулся с непредвиденной ошибкой",
            seeAlso = listOf(
                SeeAlsoModel("RFC 9110", "https://httpwg.org/specs/rfc9110.html#status.500"),
                SeeAlsoModel("MDN Web Docs", "https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/500")
            ),
            source = "RFC 7231, Section 6.6.1"
        ),

        ErrorsUiModel(
            code = "501",
            title = "Not Implemented",
            imageUrl = "https://http.cat/501.jpg",
            description = "Сервер не поддерживает функциональность, требуемую для выполнения запроса",
            seeAlso = listOf(
                SeeAlsoModel("RFC 9110", "https://httpwg.org/specs/rfc9110.html#status.501"),
                SeeAlsoModel("MDN Web Docs", "https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/501")
            ),
            source = "RFC 7231, Section 6.6.2"
        ),

        ErrorsUiModel(
            code = "502",
            title = "Bad Gateway",
            imageUrl = "https://http.cat/502.jpg",
            description = "Сервер, действуя как шлюз, получил неверный ответ от вышестоящего сервера",
            seeAlso = listOf(
                SeeAlsoModel("RFC 9110", "https://httpwg.org/specs/rfc9110.html#status.502"),
                SeeAlsoModel("MDN Web Docs", "https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/502")
            ),
            source = "RFC 7231, Section 6.6.3"
        ),

        ErrorsUiModel(
            code = "503",
            title = "Service Unavailable",
            imageUrl = "https://http.cat/503.jpg",
            description = "Сервер временно не может обработать запрос из-за перегрузки или технического обслуживания",
            seeAlso = listOf(
                SeeAlsoModel("RFC 9110", "https://httpwg.org/specs/rfc9110.html#status.503"),
                SeeAlsoModel("MDN Web Docs", "https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/503")
            ),
            source = "RFC 7231, Section 6.6.4"
        )
    )
}