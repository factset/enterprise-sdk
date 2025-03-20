
# flake8: noqa

# Import all APIs into this package.
# If you have many APIs here with many many models used in each API this may
# raise a `RecursionError`.
# In order to avoid this, import only the API that you directly need like:
#
#   from .api.market_impact_api import MarketImpactApi
#
# or import this package, but before doing it, use:
#
#   import sys
#   sys.setrecursionlimit(n)

# Import APIs into API package:
from fds.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.api.market_impact_api import MarketImpactApi
from fds.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.api.order_details_api import OrderDetailsApi
from fds.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.api.order_search_api import OrderSearchApi
from fds.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.api.outliers_api import OutliersApi
from fds.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.api.quote_analytics_api import QuoteAnalyticsApi
from fds.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.api.reports_api import ReportsApi
from fds.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.api.trade_analytics_api import TradeAnalyticsApi
from fds.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.api.z_score_api import ZScoreApi
