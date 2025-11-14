
# flake8: noqa

# Import all APIs into this package.
# If you have many APIs here with many many models used in each API this may
# raise a `RecursionError`.
# In order to avoid this, import only the API that you directly need like:
#
#   from .api.axioma_equity_portfolio_optimizer_api import AxiomaEquityPortfolioOptimizerApi
#
# or import this package, but before doing it, use:
#
#   import sys
#   sys.setrecursionlimit(n)

# Import APIs into API package:
from fds.sdk.OPENOPTIMIZER.api.axioma_equity_portfolio_optimizer_api import AxiomaEquityPortfolioOptimizerApi
from fds.sdk.OPENOPTIMIZER.api.axioma_fixed_income_portfolio_optimizer_api import AxiomaFixedIncomePortfolioOptimizerApi
from fds.sdk.OPENOPTIMIZER.api.barra_portfolio_optimizer_api import BarraPortfolioOptimizerApi
from fds.sdk.OPENOPTIMIZER.api.fact_set_portfolio_optimizer_api import FactSetPortfolioOptimizerApi
from fds.sdk.OPENOPTIMIZER.api.northfield_portfolio_optimizer_api import NorthfieldPortfolioOptimizerApi
