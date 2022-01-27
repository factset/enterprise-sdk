# flake8: noqa

# import all models into this package
# if you have many models here with many references from one model to another this may
# raise a RecursionError
# to avoid this, import only the models that you directly need like:
# from from fds.sdk.FactSetFunds.model.pet import Pet
# or import this package, but before doing it, use:
# import sys
# sys.setrecursionlimit(n)

from fds.sdk.FactSetFunds.model.aum import Aum
from fds.sdk.FactSetFunds.model.aum_request import AumRequest
from fds.sdk.FactSetFunds.model.aum_response import AumResponse
from fds.sdk.FactSetFunds.model.benchmark_details import BenchmarkDetails
from fds.sdk.FactSetFunds.model.benchmark_details_request import BenchmarkDetailsRequest
from fds.sdk.FactSetFunds.model.benchmark_details_response import BenchmarkDetailsResponse
from fds.sdk.FactSetFunds.model.classifications import Classifications
from fds.sdk.FactSetFunds.model.classifications_request import ClassificationsRequest
from fds.sdk.FactSetFunds.model.classifications_response import ClassificationsResponse
from fds.sdk.FactSetFunds.model.costs_fees import CostsFees
from fds.sdk.FactSetFunds.model.costs_fees_ids import CostsFeesIds
from fds.sdk.FactSetFunds.model.costs_fees_request import CostsFeesRequest
from fds.sdk.FactSetFunds.model.costs_fees_response import CostsFeesResponse
from fds.sdk.FactSetFunds.model.data_type import DataType
from fds.sdk.FactSetFunds.model.dividend_adjust import DividendAdjust
from fds.sdk.FactSetFunds.model.error_response import ErrorResponse
from fds.sdk.FactSetFunds.model.error_response_sub_errors import ErrorResponseSubErrors
from fds.sdk.FactSetFunds.model.flows import Flows
from fds.sdk.FactSetFunds.model.flows_request import FlowsRequest
from fds.sdk.FactSetFunds.model.flows_response import FlowsResponse
from fds.sdk.FactSetFunds.model.frequency import Frequency
from fds.sdk.FactSetFunds.model.frequency_aum import FrequencyAum
from fds.sdk.FactSetFunds.model.funds_prices_request import FundsPricesRequest
from fds.sdk.FactSetFunds.model.funds_prices_response import FundsPricesResponse
from fds.sdk.FactSetFunds.model.funds_returns_request import FundsReturnsRequest
from fds.sdk.FactSetFunds.model.funds_returns_response import FundsReturnsResponse
from fds.sdk.FactSetFunds.model.funds_returns_snapshot_request import FundsReturnsSnapshotRequest
from fds.sdk.FactSetFunds.model.funds_returns_snapshot_response import FundsReturnsSnapshotResponse
from fds.sdk.FactSetFunds.model.ids import Ids
from fds.sdk.FactSetFunds.model.managers import Managers
from fds.sdk.FactSetFunds.model.managers_request import ManagersRequest
from fds.sdk.FactSetFunds.model.managers_response import ManagersResponse
from fds.sdk.FactSetFunds.model.prices import Prices
from fds.sdk.FactSetFunds.model.related_funds import RelatedFunds
from fds.sdk.FactSetFunds.model.related_funds_request import RelatedFundsRequest
from fds.sdk.FactSetFunds.model.related_funds_response import RelatedFundsResponse
from fds.sdk.FactSetFunds.model.returns import Returns
from fds.sdk.FactSetFunds.model.returns_range import ReturnsRange
from fds.sdk.FactSetFunds.model.returns_range_request import ReturnsRangeRequest
from fds.sdk.FactSetFunds.model.returns_range_response import ReturnsRangeResponse
from fds.sdk.FactSetFunds.model.returns_snapshot import ReturnsSnapshot
from fds.sdk.FactSetFunds.model.split_adjust import SplitAdjust
from fds.sdk.FactSetFunds.model.statuses import Statuses
from fds.sdk.FactSetFunds.model.statuses_request import StatusesRequest
from fds.sdk.FactSetFunds.model.statuses_response import StatusesResponse
from fds.sdk.FactSetFunds.model.summaries import Summaries
from fds.sdk.FactSetFunds.model.summaries_request import SummariesRequest
from fds.sdk.FactSetFunds.model.summaries_response import SummariesResponse
