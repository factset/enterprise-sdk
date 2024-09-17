# flake8: noqa

# import all models into this package
# if you have many models here with many references from one model to another this may
# raise a RecursionError
# to avoid this, import only the models that you directly need like:
# from from fds.sdk.Cabot.model.pet import Pet
# or import this package, but before doing it, use:
# import sys
# sys.setrecursionlimit(n)

from fds.sdk.Cabot.model.add_trim_model_analytics import AddTrimModelAnalytics
from fds.sdk.Cabot.model.add_trim_response_options import AddTrimResponseOptions
from fds.sdk.Cabot.model.add_trim_response_root import AddTrimResponseRoot
from fds.sdk.Cabot.model.attributes import Attributes
from fds.sdk.Cabot.model.buy_context_model_analytics import BuyContextModelAnalytics
from fds.sdk.Cabot.model.buy_context_model_analytics_context import BuyContextModelAnalyticsContext
from fds.sdk.Cabot.model.buy_context_model_analytics_context_attribute import BuyContextModelAnalyticsContextAttribute
from fds.sdk.Cabot.model.buy_context_model_analytics_item import BuyContextModelAnalyticsItem
from fds.sdk.Cabot.model.buy_context_model_analytics_item_range import BuyContextModelAnalyticsItemRange
from fds.sdk.Cabot.model.buy_context_response_options import BuyContextResponseOptions
from fds.sdk.Cabot.model.buy_context_response_root import BuyContextResponseRoot
from fds.sdk.Cabot.model.buy_timing_model_analytics import BuyTimingModelAnalytics
from fds.sdk.Cabot.model.buy_timing_response_options import BuyTimingResponseOptions
from fds.sdk.Cabot.model.buy_timing_response_root import BuyTimingResponseRoot
from fds.sdk.Cabot.model.client_error_response import ClientErrorResponse
from fds.sdk.Cabot.model.construction_model_analytics import ConstructionModelAnalytics
from fds.sdk.Cabot.model.construction_model_analytics_active_weights import ConstructionModelAnalyticsActiveWeights
from fds.sdk.Cabot.model.construction_model_analytics_active_weights_max_over import ConstructionModelAnalyticsActiveWeightsMaxOver
from fds.sdk.Cabot.model.construction_model_analytics_position_count import ConstructionModelAnalyticsPositionCount
from fds.sdk.Cabot.model.construction_response_options import ConstructionResponseOptions
from fds.sdk.Cabot.model.construction_response_root import ConstructionResponseRoot
from fds.sdk.Cabot.model.error import Error
from fds.sdk.Cabot.model.error_source import ErrorSource
from fds.sdk.Cabot.model.hit_rate_model_analytics import HitRateModelAnalytics
from fds.sdk.Cabot.model.hit_rate_model_analytics_losers import HitRateModelAnalyticsLosers
from fds.sdk.Cabot.model.hit_rate_model_analytics_winners import HitRateModelAnalyticsWinners
from fds.sdk.Cabot.model.hit_rate_response_options import HitRateResponseOptions
from fds.sdk.Cabot.model.hit_rate_response_root import HitRateResponseRoot
from fds.sdk.Cabot.model.ramp_down_model_analytics import RampDownModelAnalytics
from fds.sdk.Cabot.model.ramp_down_response_options import RampDownResponseOptions
from fds.sdk.Cabot.model.ramp_down_response_root import RampDownResponseRoot
from fds.sdk.Cabot.model.ramp_up_model_analytics import RampUpModelAnalytics
from fds.sdk.Cabot.model.ramp_up_response_options import RampUpResponseOptions
from fds.sdk.Cabot.model.ramp_up_response_root import RampUpResponseRoot
from fds.sdk.Cabot.model.regions import Regions
from fds.sdk.Cabot.model.results_model_analytics import ResultsModelAnalytics
from fds.sdk.Cabot.model.results_model_analytics_captures import ResultsModelAnalyticsCaptures
from fds.sdk.Cabot.model.results_model_analytics_ratios import ResultsModelAnalyticsRatios
from fds.sdk.Cabot.model.results_model_analytics_returns import ResultsModelAnalyticsReturns
from fds.sdk.Cabot.model.results_model_analytics_risk import ResultsModelAnalyticsRisk
from fds.sdk.Cabot.model.results_model_analytics_statistics import ResultsModelAnalyticsStatistics
from fds.sdk.Cabot.model.results_response_options import ResultsResponseOptions
from fds.sdk.Cabot.model.results_response_root import ResultsResponseRoot
from fds.sdk.Cabot.model.sectors import Sectors
from fds.sdk.Cabot.model.sell_timing_model_analytics import SellTimingModelAnalytics
from fds.sdk.Cabot.model.sell_timing_response_options import SellTimingResponseOptions
from fds.sdk.Cabot.model.sell_timing_response_root import SellTimingResponseRoot
from fds.sdk.Cabot.model.skills_model_analytics import SkillsModelAnalytics
from fds.sdk.Cabot.model.skills_response_options import SkillsResponseOptions
from fds.sdk.Cabot.model.skills_response_root import SkillsResponseRoot
from fds.sdk.Cabot.model.stop_loss_model_analytics import StopLossModelAnalytics
from fds.sdk.Cabot.model.stop_loss_response_options import StopLossResponseOptions
from fds.sdk.Cabot.model.stop_loss_response_root import StopLossResponseRoot
