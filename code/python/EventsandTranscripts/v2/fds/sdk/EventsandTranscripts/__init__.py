# flake8: noqa

"""
    Events and Transcripts API

    <p>The Calendar Events API provides access to FactSetâ€™s Event Calendar data alongside business logic that allows users to replicate views and functionality consistent with the experience provided by the Workstation. This API provides the ability to pull Event Calendar data based on specific filters.</p> <p>Events Audio API provides access to historical as well as the latest audio recordings of various company events covered by FactSet. The events include, but are not limited to: earnings calls, conferences, and investor days. This API also provides relevant metadata such as timestamps and identifiers around each audio file.</p> <p>The  Near Real-time Transcripts API enables access to Near Real-time Transcripts provided by CallStreet to time-sensitive clients. This API also provides the relevant speaker metadata along with their confidence scores. This data caters to quant clients interested in building machine learning models. Clients can leverage this API to perform sentiment analysis through natural language processing or machine learning. It can also be used to complement analysis using FactSet's transcripts service.</p> <p>Transcripts API provides conference call transcripts for companies' publicly held conference calls and a wealth of information regarding upcoming corporate events, such as conference call date and time, phone number and password, type of conference call, and important company investor relations contact information.</p>   # noqa: E501

    The version of the OpenAPI document: 2.0.0
    Contact: api@factset.com
    Generated by: https://openapi-generator.tech
"""


__version__ = "2.0.0"

# import ApiClient
from fds.sdk.EventsandTranscripts.api_client import ApiClient

# import Configuration
from fds.sdk.EventsandTranscripts.configuration import Configuration

# import exceptions
from fds.sdk.EventsandTranscripts.exceptions import OpenApiException
from fds.sdk.EventsandTranscripts.exceptions import ApiAttributeError
from fds.sdk.EventsandTranscripts.exceptions import ApiTypeError
from fds.sdk.EventsandTranscripts.exceptions import ApiValueError
from fds.sdk.EventsandTranscripts.exceptions import ApiKeyError
from fds.sdk.EventsandTranscripts.exceptions import ApiException
