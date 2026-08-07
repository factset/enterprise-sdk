# flake8: noqa

# import all models into this package
# if you have many models here with many references from one model to another this may
# raise a RecursionError
# to avoid this, import only the models that you directly need like:
# from from fds.sdk.FactSetMacroeconomics.model.pet import Pet
# or import this package, but before doing it, use:
# import sys
# sys.setrecursionlimit(n)

from fds.sdk.FactSetMacroeconomics.model.as_reported_economics_response import AsReportedEconomicsResponse
from fds.sdk.FactSetMacroeconomics.model.as_reported_economics_series import AsReportedEconomicsSeries
from fds.sdk.FactSetMacroeconomics.model.economic_time_series import EconomicTimeSeries
from fds.sdk.FactSetMacroeconomics.model.error_object import ErrorObject
from fds.sdk.FactSetMacroeconomics.model.error_response import ErrorResponse
from fds.sdk.FactSetMacroeconomics.model.event import Event
from fds.sdk.FactSetMacroeconomics.model.event_count_item import EventCountItem
from fds.sdk.FactSetMacroeconomics.model.event_count_response import EventCountResponse
from fds.sdk.FactSetMacroeconomics.model.event_release import EventRelease
from fds.sdk.FactSetMacroeconomics.model.event_response import EventResponse
from fds.sdk.FactSetMacroeconomics.model.item_type_country import ItemTypeCountry
from fds.sdk.FactSetMacroeconomics.model.item_type_fds_code import ItemTypeFdsCode
from fds.sdk.FactSetMacroeconomics.model.item_type_indicator import ItemTypeIndicator
from fds.sdk.FactSetMacroeconomics.model.item_type_timezone import ItemTypeTimezone
from fds.sdk.FactSetMacroeconomics.model.meta_events_response import MetaEventsResponse
from fds.sdk.FactSetMacroeconomics.model.meta_series_response import MetaSeriesResponse
from fds.sdk.FactSetMacroeconomics.model.reference_item import ReferenceItem
from fds.sdk.FactSetMacroeconomics.model.reference_item_country import ReferenceItemCountry
from fds.sdk.FactSetMacroeconomics.model.reference_item_fds_code import ReferenceItemFdsCode
from fds.sdk.FactSetMacroeconomics.model.reference_item_indicator import ReferenceItemIndicator
from fds.sdk.FactSetMacroeconomics.model.reference_item_timezone import ReferenceItemTimezone
from fds.sdk.FactSetMacroeconomics.model.response_meta import ResponseMeta
from fds.sdk.FactSetMacroeconomics.model.response_meta_pagination import ResponseMetaPagination
from fds.sdk.FactSetMacroeconomics.model.series_metadata import SeriesMetadata
