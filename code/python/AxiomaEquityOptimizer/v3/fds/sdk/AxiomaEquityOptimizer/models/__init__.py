# flake8: noqa

# import all models into this package
# if you have many models here with many references from one model to another this may
# raise a RecursionError
# to avoid this, import only the models that you directly need like:
# from from fds.sdk.AxiomaEquityOptimizer.model.pet import Pet
# or import this package, but before doing it, use:
# import sys
# sys.setrecursionlimit(n)

from fds.sdk.AxiomaEquityOptimizer.model.account_directories import AccountDirectories
from fds.sdk.AxiomaEquityOptimizer.model.account_directories_root import AccountDirectoriesRoot
from fds.sdk.AxiomaEquityOptimizer.model.axioma_equity_optimization_parameters import AxiomaEquityOptimizationParameters
from fds.sdk.AxiomaEquityOptimizer.model.axioma_equity_optimization_parameters_root import AxiomaEquityOptimizationParametersRoot
from fds.sdk.AxiomaEquityOptimizer.model.calculation_info import CalculationInfo
from fds.sdk.AxiomaEquityOptimizer.model.calculation_info_root import CalculationInfoRoot
from fds.sdk.AxiomaEquityOptimizer.model.client_error_response import ClientErrorResponse
from fds.sdk.AxiomaEquityOptimizer.model.currency import Currency
from fds.sdk.AxiomaEquityOptimizer.model.currency_root import CurrencyRoot
from fds.sdk.AxiomaEquityOptimizer.model.document_directories import DocumentDirectories
from fds.sdk.AxiomaEquityOptimizer.model.document_directories_root import DocumentDirectoriesRoot
from fds.sdk.AxiomaEquityOptimizer.model.error import Error
from fds.sdk.AxiomaEquityOptimizer.model.error_source import ErrorSource
from fds.sdk.AxiomaEquityOptimizer.model.object_root import ObjectRoot
from fds.sdk.AxiomaEquityOptimizer.model.optimal_portfolio import OptimalPortfolio
from fds.sdk.AxiomaEquityOptimizer.model.optimization import Optimization
from fds.sdk.AxiomaEquityOptimizer.model.optimizer_account import OptimizerAccount
from fds.sdk.AxiomaEquityOptimizer.model.optimizer_account_overrides import OptimizerAccountOverrides
from fds.sdk.AxiomaEquityOptimizer.model.optimizer_optimal_holdings import OptimizerOptimalHoldings
from fds.sdk.AxiomaEquityOptimizer.model.optimizer_output_types import OptimizerOutputTypes
from fds.sdk.AxiomaEquityOptimizer.model.optimizer_strategy import OptimizerStrategy
from fds.sdk.AxiomaEquityOptimizer.model.optimizer_strategy_overrides import OptimizerStrategyOverrides
from fds.sdk.AxiomaEquityOptimizer.model.optimizer_trades_list import OptimizerTradesList
