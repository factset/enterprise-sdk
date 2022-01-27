# flake8: noqa

# import all models into this package
# if you have many models here with many references from one model to another this may
# raise a RecursionError
# to avoid this, import only the models that you directly need like:
# from from fds.sdk.SPAREngine.model.pet import Pet
# or import this package, but before doing it, use:
# import sys
# sys.setrecursionlimit(n)

from fds.sdk.SPAREngine.model.account_directories import AccountDirectories
from fds.sdk.SPAREngine.model.account_directories_root import AccountDirectoriesRoot
from fds.sdk.SPAREngine.model.calculation_meta import CalculationMeta
from fds.sdk.SPAREngine.model.calculation_status import CalculationStatus
from fds.sdk.SPAREngine.model.calculation_status_meta import CalculationStatusMeta
from fds.sdk.SPAREngine.model.calculation_status_root import CalculationStatusRoot
from fds.sdk.SPAREngine.model.calculation_unit_status import CalculationUnitStatus
from fds.sdk.SPAREngine.model.calculation_unit_status_meta import CalculationUnitStatusMeta
from fds.sdk.SPAREngine.model.client_error_response import ClientErrorResponse
from fds.sdk.SPAREngine.model.component_summary import ComponentSummary
from fds.sdk.SPAREngine.model.component_summary_root import ComponentSummaryRoot
from fds.sdk.SPAREngine.model.currency import Currency
from fds.sdk.SPAREngine.model.currency_root import CurrencyRoot
from fds.sdk.SPAREngine.model.document_directories import DocumentDirectories
from fds.sdk.SPAREngine.model.document_directories_root import DocumentDirectoriesRoot
from fds.sdk.SPAREngine.model.error import Error
from fds.sdk.SPAREngine.model.error_source import ErrorSource
from fds.sdk.SPAREngine.model.frequency import Frequency
from fds.sdk.SPAREngine.model.frequency_root import FrequencyRoot
from fds.sdk.SPAREngine.model.object_root import ObjectRoot
from fds.sdk.SPAREngine.model.return_type import ReturnType
from fds.sdk.SPAREngine.model.spar_accounts import SPARAccounts
from fds.sdk.SPAREngine.model.spar_accounts_root import SPARAccountsRoot
from fds.sdk.SPAREngine.model.spar_benchmark import SPARBenchmark
from fds.sdk.SPAREngine.model.spar_benchmark_root import SPARBenchmarkRoot
from fds.sdk.SPAREngine.model.spar_calculation_parameters import SPARCalculationParameters
from fds.sdk.SPAREngine.model.spar_calculation_parameters_root import SPARCalculationParametersRoot
from fds.sdk.SPAREngine.model.spar_date_parameters import SPARDateParameters
from fds.sdk.SPAREngine.model.spar_identifier import SPARIdentifier
