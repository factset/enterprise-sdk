# flake8: noqa

# import all models into this package
# if you have many models here with many references from one model to another this may
# raise a RecursionError
# to avoid this, import only the models that you directly need like:
# from from fds.sdk.FactSetPortfolioOptimizer.model.pet import Pet
# or import this package, but before doing it, use:
# import sys
# sys.setrecursionlimit(n)

from fds.sdk.FactSetPortfolioOptimizer.model.document_directories import DocumentDirectories
from fds.sdk.FactSetPortfolioOptimizer.model.fpo_account import FPOAccount
from fds.sdk.FactSetPortfolioOptimizer.model.fpo_optimization_parameters import FPOOptimizationParameters
from fds.sdk.FactSetPortfolioOptimizer.model.optimal_portfolio import OptimalPortfolio
from fds.sdk.FactSetPortfolioOptimizer.model.optimization import Optimization
from fds.sdk.FactSetPortfolioOptimizer.model.optimizer_account import OptimizerAccount
from fds.sdk.FactSetPortfolioOptimizer.model.optimizer_account_overrides import OptimizerAccountOverrides
from fds.sdk.FactSetPortfolioOptimizer.model.optimizer_optimal_holdings import OptimizerOptimalHoldings
from fds.sdk.FactSetPortfolioOptimizer.model.optimizer_output_types import OptimizerOutputTypes
from fds.sdk.FactSetPortfolioOptimizer.model.optimizer_strategy import OptimizerStrategy
from fds.sdk.FactSetPortfolioOptimizer.model.optimizer_strategy_overrides import OptimizerStrategyOverrides
from fds.sdk.FactSetPortfolioOptimizer.model.optimizer_trades_list import OptimizerTradesList
from fds.sdk.FactSetPortfolioOptimizer.model.pa_doc import PaDoc
