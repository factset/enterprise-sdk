# flake8: noqa

# import all models into this package
# if you have many models here with many references from one model to another this may
# raise a RecursionError
# to avoid this, import only the models that you directly need like:
# from from fds.sdk.OpenRisk.model.pet import Pet
# or import this package, but before doing it, use:
# import sys
# sys.setrecursionlimit(n)

from fds.sdk.OpenRisk.model.additional_calculation_inputs import AdditionalCalculationInputs
from fds.sdk.OpenRisk.model.additional_calculation_inputs_market_excess import AdditionalCalculationInputsMarketExcess
from fds.sdk.OpenRisk.model.asset_types import AssetTypes
from fds.sdk.OpenRisk.model.calculate_from_holdings_request_body import CalculateFromHoldingsRequestBody
from fds.sdk.OpenRisk.model.calculate_from_holdings_request_data import CalculateFromHoldingsRequestData
from fds.sdk.OpenRisk.model.calendar_code import CalendarCode
from fds.sdk.OpenRisk.model.composite_asset_definitions import CompositeAssetDefinitions
from fds.sdk.OpenRisk.model.covariance_date_format_convention import CovarianceDateFormatConvention
from fds.sdk.OpenRisk.model.currency_iso_code import CurrencyISOCode
from fds.sdk.OpenRisk.model.date import Date
from fds.sdk.OpenRisk.model.error_item import ErrorItem
from fds.sdk.OpenRisk.model.error_response import ErrorResponse
from fds.sdk.OpenRisk.model.exposure_date_format_convention import ExposureDateFormatConvention
from fds.sdk.OpenRisk.model.factor_group import FactorGroup
from fds.sdk.OpenRisk.model.factor_group_nodes import FactorGroupNodes
from fds.sdk.OpenRisk.model.factors_visible import FactorsVisible
from fds.sdk.OpenRisk.model.generate_id_mapping_request_body import GenerateIDMappingRequestBody
from fds.sdk.OpenRisk.model.generate_id_mapping_request_data import GenerateIDMappingRequestData
from fds.sdk.OpenRisk.model.groups_labels import GroupsLabels
from fds.sdk.OpenRisk.model.holding import Holding
from fds.sdk.OpenRisk.model.holding_all_of import HoldingAllOf
from fds.sdk.OpenRisk.model.holdings import Holdings
from fds.sdk.OpenRisk.model.ids_and_market_values import IDsAndMarketValues
from fds.sdk.OpenRisk.model.inline_response200 import InlineResponse200
from fds.sdk.OpenRisk.model.inline_response2001 import InlineResponse2001
from fds.sdk.OpenRisk.model.inline_response2001_data import InlineResponse2001Data
from fds.sdk.OpenRisk.model.inline_response2001_data_factors import InlineResponse2001DataFactors
from fds.sdk.OpenRisk.model.inline_response2001_data_risk_model_append_format import InlineResponse2001DataRiskModelAppendFormat
from fds.sdk.OpenRisk.model.inline_response2002 import InlineResponse2002
from fds.sdk.OpenRisk.model.inline_response2003 import InlineResponse2003
from fds.sdk.OpenRisk.model.inline_response2004 import InlineResponse2004
from fds.sdk.OpenRisk.model.inline_response200_data import InlineResponse200Data
from fds.sdk.OpenRisk.model.inline_response403 import InlineResponse403
from fds.sdk.OpenRisk.model.inline_response404 import InlineResponse404
from fds.sdk.OpenRisk.model.input_to_result_security_index_mapping import InputToResultSecurityIndexMapping
from fds.sdk.OpenRisk.model.labels import Labels
from fds.sdk.OpenRisk.model.labels_factor import LabelsFactor
from fds.sdk.OpenRisk.model.labels_security import LabelsSecurity
from fds.sdk.OpenRisk.model.lagging_dates import LaggingDates
from fds.sdk.OpenRisk.model.mapped_security_info import MappedSecurityInfo
from fds.sdk.OpenRisk.model.remove_currency_risk import RemoveCurrencyRisk
from fds.sdk.OpenRisk.model.remove_currency_risk_ids import RemoveCurrencyRiskIDs
from fds.sdk.OpenRisk.model.requires_factor_returns import RequiresFactorReturns
from fds.sdk.OpenRisk.model.resolved_dates import ResolvedDates
from fds.sdk.OpenRisk.model.result_to_input_security_index_mapping import ResultToInputSecurityIndexMapping
from fds.sdk.OpenRisk.model.risk_exclusion_info import RiskExclusionInfo
from fds.sdk.OpenRisk.model.risk_exclusion_info_exclusion_info import RiskExclusionInfoExclusionInfo
from fds.sdk.OpenRisk.model.risk_mapping_entry import RiskMappingEntry
from fds.sdk.OpenRisk.model.risk_model_append_data import RiskModelAppendData
from fds.sdk.OpenRisk.model.risk_model_append_data_value import RiskModelAppendDataValue
from fds.sdk.OpenRisk.model.risk_model_code import RiskModelCode
from fds.sdk.OpenRisk.model.risk_model_factor import RiskModelFactor
from fds.sdk.OpenRisk.model.security_group import SecurityGroup
from fds.sdk.OpenRisk.model.security_index_mapping import SecurityIndexMapping
from fds.sdk.OpenRisk.model.security_only_labels import SecurityOnlyLabels
from fds.sdk.OpenRisk.model.security_only_labels_security import SecurityOnlyLabelsSecurity
from fds.sdk.OpenRisk.model.security_only_success_response_meta import SecurityOnlySuccessResponseMeta
from fds.sdk.OpenRisk.model.stat import Stat
from fds.sdk.OpenRisk.model.stat_calculation_level import StatCalculationLevel
from fds.sdk.OpenRisk.model.stat_calculation_settings import StatCalculationSettings
from fds.sdk.OpenRisk.model.stat_result_value import StatResultValue
from fds.sdk.OpenRisk.model.stat_result_value_dense_matrix import StatResultValueDenseMatrix
from fds.sdk.OpenRisk.model.stat_result_value_sparse_matrix import StatResultValueSparseMatrix
from fds.sdk.OpenRisk.model.stat_result_value_vector import StatResultValueVector
from fds.sdk.OpenRisk.model.stats import Stats
from fds.sdk.OpenRisk.model.stats_results import StatsResults
from fds.sdk.OpenRisk.model.string_date import StringDate
from fds.sdk.OpenRisk.model.success_response_meta import SuccessResponseMeta
from fds.sdk.OpenRisk.model.supported_stats import SupportedStats
from fds.sdk.OpenRisk.model.supported_stats_data import SupportedStatsData
from fds.sdk.OpenRisk.model.supported_stats_levels import SupportedStatsLevels
from fds.sdk.OpenRisk.model.supported_stats_names_only import SupportedStatsNamesOnly
from fds.sdk.OpenRisk.model.supported_stats_security_group_method import SupportedStatsSecurityGroupMethod
from fds.sdk.OpenRisk.model.underlying_ids import UnderlyingIDs
from fds.sdk.OpenRisk.model.warning_item import WarningItem
from fds.sdk.OpenRisk.model.warnings import Warnings
