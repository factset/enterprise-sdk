# flake8: noqa

# import all models into this package
# if you have many models here with many references from one model to another this may
# raise a RecursionError
# to avoid this, import only the models that you directly need like:
# from from fds.sdk.AxiomaFixedIncomeOptimizer.model.pet import Pet
# or import this package, but before doing it, use:
# import sys
# sys.setrecursionlimit(n)

from fds.sdk.AxiomaFixedIncomeOptimizer.model.afi_optimization_parameters import AFIOptimizationParameters
from fds.sdk.AxiomaFixedIncomeOptimizer.model.afi_optimization_parameters_root import AFIOptimizationParametersRoot
from fds.sdk.AxiomaFixedIncomeOptimizer.model.afi_optimizer_strategy import AFIOptimizerStrategy
from fds.sdk.AxiomaFixedIncomeOptimizer.model.afi_optimizer_strategy_overrides import AFIOptimizerStrategyOverrides
from fds.sdk.AxiomaFixedIncomeOptimizer.model.calculation_info import CalculationInfo
from fds.sdk.AxiomaFixedIncomeOptimizer.model.calculation_info_root import CalculationInfoRoot
from fds.sdk.AxiomaFixedIncomeOptimizer.model.client_error_response import ClientErrorResponse
from fds.sdk.AxiomaFixedIncomeOptimizer.model.document_directories import DocumentDirectories
from fds.sdk.AxiomaFixedIncomeOptimizer.model.document_directories_root import DocumentDirectoriesRoot
from fds.sdk.AxiomaFixedIncomeOptimizer.model.error import Error
from fds.sdk.AxiomaFixedIncomeOptimizer.model.error_source import ErrorSource
from fds.sdk.AxiomaFixedIncomeOptimizer.model.object_root import ObjectRoot
from fds.sdk.AxiomaFixedIncomeOptimizer.model.optimal_portfolio import OptimalPortfolio
from fds.sdk.AxiomaFixedIncomeOptimizer.model.optimization import Optimization
from fds.sdk.AxiomaFixedIncomeOptimizer.model.optimizer_account import OptimizerAccount
from fds.sdk.AxiomaFixedIncomeOptimizer.model.optimizer_account_overrides import OptimizerAccountOverrides
from fds.sdk.AxiomaFixedIncomeOptimizer.model.optimizer_optimal_holdings import OptimizerOptimalHoldings
from fds.sdk.AxiomaFixedIncomeOptimizer.model.optimizer_output_types import OptimizerOutputTypes
from fds.sdk.AxiomaFixedIncomeOptimizer.model.optimizer_trades_list import OptimizerTradesList
