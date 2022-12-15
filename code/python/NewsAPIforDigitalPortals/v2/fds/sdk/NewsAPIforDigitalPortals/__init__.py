# flake8: noqa

"""
    News API For Digital Portals

    Consume FactSet’s StreetAccount news and 3rd party content through an API that seamlessly integrates with [quotes](https://developer.factset.com/api-catalog/quotes-api-digital-portals), [time series](https://developer.factset.com/api-catalog/time-series-api-digital-portals), [watchlists](https://developer.factset.com/api-catalog/watchlist-api-digital-portals), and other Functional APIs.  Search for news articles from various news distributors and publishers. Incorporate a multitude of search parameters such as region, category, source, article type and provider-specific meta data, to easily filter out the noise.  All search and list endpoints can be subscribed to receive streamed updates.  News providers include:  * APA * AWP  * Businesswire * Cercle Finance * Direkt News SE * Dow Jones News * dpa * dpa-AFX  * EUWAX * GlobenewsWire * Kauppalehti * Midnight Trader * MoneyAM * newsaktuell * OMX * PR Newswire  * Ritzau Finans * StreetAccount News * TDN News        See the [Quotes API for Digital Portals](https://developer.factset.com/api-catalog/quotes-api-digital-portals) for access to detailed price and performance information, plus basic support for security identifier cross-reference.   # noqa: E501

    The version of the OpenAPI document: 2
    Generated by: https://openapi-generator.tech
"""


__version__ = "0.10.3"

# import ApiClient
from fds.sdk.NewsAPIforDigitalPortals.api_client import ApiClient

# import Configuration
from fds.sdk.NewsAPIforDigitalPortals.configuration import Configuration

# import exceptions
from fds.sdk.NewsAPIforDigitalPortals.exceptions import OpenApiException
from fds.sdk.NewsAPIforDigitalPortals.exceptions import ApiAttributeError
from fds.sdk.NewsAPIforDigitalPortals.exceptions import ApiTypeError
from fds.sdk.NewsAPIforDigitalPortals.exceptions import ApiValueError
from fds.sdk.NewsAPIforDigitalPortals.exceptions import ApiKeyError
from fds.sdk.NewsAPIforDigitalPortals.exceptions import ApiException
