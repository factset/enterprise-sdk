# flake8: noqa

# import all models into this package
# if you have many models here with many references from one model to another this may
# raise a RecursionError
# to avoid this, import only the models that you directly need like:
# from from fds.sdk.ForeignExchangeRate.model.pet import Pet
# or import this package, but before doing it, use:
# import sys
# sys.setrecursionlimit(n)

from fds.sdk.ForeignExchangeRate.model.error_response import ErrorResponse
from fds.sdk.ForeignExchangeRate.model.error_response_sub_errors import ErrorResponseSubErrors
from fds.sdk.ForeignExchangeRate.model.forward import Forward
from fds.sdk.ForeignExchangeRate.model.forward_period import ForwardPeriod
from fds.sdk.ForeignExchangeRate.model.forwards_request import ForwardsRequest
from fds.sdk.ForeignExchangeRate.model.forwards_response import ForwardsResponse
from fds.sdk.ForeignExchangeRate.model.frequency import Frequency
from fds.sdk.ForeignExchangeRate.model.ids import Ids
from fds.sdk.ForeignExchangeRate.model.spot import Spot
from fds.sdk.ForeignExchangeRate.model.spots_request import SpotsRequest
from fds.sdk.ForeignExchangeRate.model.spots_response import SpotsResponse
