# flake8: noqa

# import all models into this package
# if you have many models here with many references from one model to another this may
# raise a RecursionError
# to avoid this, import only the models that you directly need like:
# from from fds.sdk.Conversational.model.pet import Pet
# or import this package, but before doing it, use:
# import sys
# sys.setrecursionlimit(n)

from fds.sdk.Conversational.model.adaptive_card import AdaptiveCard
from fds.sdk.Conversational.model.bad_feedback_request_error import BadFeedbackRequestError
from fds.sdk.Conversational.model.bad_feedback_request_error_object import BadFeedbackRequestErrorObject
from fds.sdk.Conversational.model.bad_request_error import BadRequestError
from fds.sdk.Conversational.model.bad_request_error_object import BadRequestErrorObject
from fds.sdk.Conversational.model.bad_request_error_with_invalid_data_schema import BadRequestErrorWithInvalidDataSchema
from fds.sdk.Conversational.model.bad_request_error_with_invalid_data_schema_object import BadRequestErrorWithInvalidDataSchemaObject
from fds.sdk.Conversational.model.chat_polling_request import ChatPollingRequest
from fds.sdk.Conversational.model.chat_polling_request_data import ChatPollingRequestData
from fds.sdk.Conversational.model.citations import Citations
from fds.sdk.Conversational.model.download import Download
from fds.sdk.Conversational.model.federation_data import FederationData
from fds.sdk.Conversational.model.feedback_request import FeedbackRequest
from fds.sdk.Conversational.model.feedback_request_data import FeedbackRequestData
from fds.sdk.Conversational.model.file_download_request import FileDownloadRequest
from fds.sdk.Conversational.model.file_download_request_data import FileDownloadRequestData
from fds.sdk.Conversational.model.file_generation_error_object import FileGenerationErrorObject
from fds.sdk.Conversational.model.forbidden_error import ForbiddenError
from fds.sdk.Conversational.model.forbidden_error_object import ForbiddenErrorObject
from fds.sdk.Conversational.model.internal_server_error import InternalServerError
from fds.sdk.Conversational.model.internal_server_error_object import InternalServerErrorObject
from fds.sdk.Conversational.model.markdown_table import MarkdownTable
from fds.sdk.Conversational.model.markdown_table_metadata import MarkdownTableMetadata
from fds.sdk.Conversational.model.next_step import NextStep
from fds.sdk.Conversational.model.next_step_item import NextStepItem
from fds.sdk.Conversational.model.open_url import OpenUrl
from fds.sdk.Conversational.model.open_url_url import OpenUrlUrl
from fds.sdk.Conversational.model.phrase import Phrase
from fds.sdk.Conversational.model.prompt_item import PromptItem
from fds.sdk.Conversational.model.prompt_parameter import PromptParameter
from fds.sdk.Conversational.model.prompt_parameters import PromptParameters
from fds.sdk.Conversational.model.query_chat_request import QueryChatRequest
from fds.sdk.Conversational.model.query_chat_request_data import QueryChatRequestData
from fds.sdk.Conversational.model.query_chat_response import QueryChatResponse
from fds.sdk.Conversational.model.query_chat_response_data import QueryChatResponseData
from fds.sdk.Conversational.model.query_response import QueryResponse
from fds.sdk.Conversational.model.query_response_data import QueryResponseData
from fds.sdk.Conversational.model.resource_not_found_error import ResourceNotFoundError
from fds.sdk.Conversational.model.resource_not_found_error_object import ResourceNotFoundErrorObject
from fds.sdk.Conversational.model.response_text import ResponseText
from fds.sdk.Conversational.model.speaker_info import SpeakerInfo
from fds.sdk.Conversational.model.status_poll_response import StatusPollResponse
from fds.sdk.Conversational.model.status_poll_response_data import StatusPollResponseData
from fds.sdk.Conversational.model.suggested_prompts import SuggestedPrompts
from fds.sdk.Conversational.model.table import Table
