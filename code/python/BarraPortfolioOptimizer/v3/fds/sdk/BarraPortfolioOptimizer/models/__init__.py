# flake8: noqa

# import all models into this package
# if you have many models here with many references from one model to another this may
# raise a RecursionError
# to avoid this, import only the models that you directly need like:
# from from fds.sdk.BarraPortfolioOptimizer.model.pet import Pet
# or import this package, but before doing it, use:
# import sys
# sys.setrecursionlimit(n)

from fds.sdk.BarraPortfolioOptimizer.model.account_directories import AccountDirectories
from fds.sdk.BarraPortfolioOptimizer.model.account_directories_root import AccountDirectoriesRoot
from fds.sdk.BarraPortfolioOptimizer.model.bpm_optimization import BPMOptimization
from fds.sdk.BarraPortfolioOptimizer.model.bpm_optimization_parameters import BPMOptimizationParameters
from fds.sdk.BarraPortfolioOptimizer.model.bpm_optimization_parameters_root import BPMOptimizationParametersRoot
from fds.sdk.BarraPortfolioOptimizer.model.bpm_optimizer_strategy import BPMOptimizerStrategy
from fds.sdk.BarraPortfolioOptimizer.model.bpm_optimizer_strategy_alpha_override import BPMOptimizerStrategyAlphaOverride
from fds.sdk.BarraPortfolioOptimizer.model.bpm_optimizer_strategy_overrides import BPMOptimizerStrategyOverrides
from fds.sdk.BarraPortfolioOptimizer.model.calculation_info import CalculationInfo
from fds.sdk.BarraPortfolioOptimizer.model.calculation_info_root import CalculationInfoRoot
from fds.sdk.BarraPortfolioOptimizer.model.client_error_response import ClientErrorResponse
from fds.sdk.BarraPortfolioOptimizer.model.constraint_action import ConstraintAction
from fds.sdk.BarraPortfolioOptimizer.model.currency import Currency
from fds.sdk.BarraPortfolioOptimizer.model.currency_root import CurrencyRoot
from fds.sdk.BarraPortfolioOptimizer.model.document_directories import DocumentDirectories
from fds.sdk.BarraPortfolioOptimizer.model.document_directories_root import DocumentDirectoriesRoot
from fds.sdk.BarraPortfolioOptimizer.model.error import Error
from fds.sdk.BarraPortfolioOptimizer.model.error_source import ErrorSource
from fds.sdk.BarraPortfolioOptimizer.model.object_root import ObjectRoot
from fds.sdk.BarraPortfolioOptimizer.model.optimal_portfolio import OptimalPortfolio
from fds.sdk.BarraPortfolioOptimizer.model.optimizer_account import OptimizerAccount
from fds.sdk.BarraPortfolioOptimizer.model.optimizer_account_overrides import OptimizerAccountOverrides
from fds.sdk.BarraPortfolioOptimizer.model.optimizer_optimal_holdings import OptimizerOptimalHoldings
from fds.sdk.BarraPortfolioOptimizer.model.optimizer_output_types import OptimizerOutputTypes
from fds.sdk.BarraPortfolioOptimizer.model.optimizer_trades_list import OptimizerTradesList
