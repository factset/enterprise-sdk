
# flake8: noqa

# Import all APIs into this package.
# If you have many APIs here with many many models used in each API this may
# raise a `RecursionError`.
# In order to avoid this, import only the API that you directly need like:
#
#   from .api.broker_detail_api import BrokerDetailApi
#
# or import this package, but before doing it, use:
#
#   import sys
#   sys.setrecursionlimit(n)

# Import APIs into API package:
from fds.sdk.FactSetEstimates.api.broker_detail_api import BrokerDetailApi
from fds.sdk.FactSetEstimates.api.consensus_api import ConsensusApi
from fds.sdk.FactSetEstimates.api.data_items_api import DataItemsApi
from fds.sdk.FactSetEstimates.api.ratings_api import RatingsApi
from fds.sdk.FactSetEstimates.api.segments_api import SegmentsApi
from fds.sdk.FactSetEstimates.api.surprise_api import SurpriseApi
