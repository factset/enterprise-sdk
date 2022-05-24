# flake8: noqa

# import all models into this package
# if you have many models here with many references from one model to another this may
# raise a RecursionError
# to avoid this, import only the models that you directly need like:
# from from fds.sdk.Signals.model.pet import Pet
# or import this package, but before doing it, use:
# import sys
# sys.setrecursionlimit(n)

from fds.sdk.Signals.model.contract import Contract
from fds.sdk.Signals.model.contract_fields import ContractFields
from fds.sdk.Signals.model.contract_fields_event_date import ContractFieldsEventDate
from fds.sdk.Signals.model.contract_fields_summary import ContractFieldsSummary
from fds.sdk.Signals.model.contract_property import ContractProperty
from fds.sdk.Signals.model.contract_property_items import ContractPropertyItems
from fds.sdk.Signals.model.date_time_interval import DateTimeInterval
from fds.sdk.Signals.model.error_item import ErrorItem
from fds.sdk.Signals.model.error_item_source import ErrorItemSource
from fds.sdk.Signals.model.error_response import ErrorResponse
from fds.sdk.Signals.model.event_adaptive_card import EventAdaptiveCard
from fds.sdk.Signals.model.event_adaptive_cards import EventAdaptiveCards
from fds.sdk.Signals.model.event_adaptive_data_item import EventAdaptiveDataItem
from fds.sdk.Signals.model.event_detail import EventDetail
from fds.sdk.Signals.model.event_detail_data_item import EventDetailDataItem
from fds.sdk.Signals.model.event_detail_data_item_all_of import EventDetailDataItemAllOf
from fds.sdk.Signals.model.event_details import EventDetails
from fds.sdk.Signals.model.event_headline_data_item import EventHeadlineDataItem
from fds.sdk.Signals.model.event_headlines import EventHeadlines
from fds.sdk.Signals.model.event_meta import EventMeta
from fds.sdk.Signals.model.event_request_body import EventRequestBody
from fds.sdk.Signals.model.events_entities import EventsEntities
from fds.sdk.Signals.model.events_meta import EventsMeta
from fds.sdk.Signals.model.events_meta_date_range import EventsMetaDateRange
from fds.sdk.Signals.model.events_meta_pagination import EventsMetaPagination
from fds.sdk.Signals.model.id_resolutions_meta import IdResolutionsMeta
from fds.sdk.Signals.model.relevance_score_range import RelevanceScoreRange
from fds.sdk.Signals.model.screen_meta import ScreenMeta
from fds.sdk.Signals.model.signal_definition import SignalDefinition
from fds.sdk.Signals.model.signal_definition_data import SignalDefinitionData
from fds.sdk.Signals.model.signal_meta_data import SignalMetaData
from fds.sdk.Signals.model.signal_meta_data_data import SignalMetaDataData
