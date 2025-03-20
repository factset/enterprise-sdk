# flake8: noqa

"""
    Real-Time News API

    Consume FactSet’s StreetAccount news and 3rd party content through an API that seamlessly integrates with [quotes](https://developer.factset.com/api-catalog/real-time-quotes-api), [time series](https://developer.factset.com/api-catalog/real-time-time-series-api), [watchlists](https://developer.factset.com/api-catalog/watchlist-api-digital-portals), and other Functional APIs.  Search for news articles from various news distributors and publishers. Incorporate a multitude of search parameters such as region, category, source, article type and provider-specific meta data, to easily filter out the noise.  All search and list endpoints can be subscribed to receive streamed updates.  News providers include:  * APA * AWP  * Businesswire * Cercle Finance * Direkt News SE * Dow Jones News * dpa * dpa-AFX  * EUWAX * GlobenewsWire * Kauppalehti * MT Newswires * MoneyAM * newsaktuell * OMX * PR Newswire  * Ritzau Finans * StreetAccount News * TDN News        See the [Real-Time Quotes API](https://developer.factset.com/api-catalog/real-time-quotes-api) for access to detailed price and performance information, plus basic support for security identifier cross-reference.   # noqa: E501

    The version of the OpenAPI document: 4.0.0
    Contact: api@factset.com
    Generated by: https://openapi-generator.tech
"""


__version__ = "0.20.1"

# import ApiClient
from fds.sdk.RealTimeNews.api_client import ApiClient

# import Configuration
from fds.sdk.RealTimeNews.configuration import Configuration

# import exceptions
from fds.sdk.RealTimeNews.exceptions import OpenApiException
from fds.sdk.RealTimeNews.exceptions import ApiAttributeError
from fds.sdk.RealTimeNews.exceptions import ApiTypeError
from fds.sdk.RealTimeNews.exceptions import ApiValueError
from fds.sdk.RealTimeNews.exceptions import ApiKeyError
from fds.sdk.RealTimeNews.exceptions import ApiException
