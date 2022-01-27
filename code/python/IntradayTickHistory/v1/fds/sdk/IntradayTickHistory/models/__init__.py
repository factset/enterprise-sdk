# flake8: noqa

# import all models into this package
# if you have many models here with many references from one model to another this may
# raise a RecursionError
# to avoid this, import only the models that you directly need like:
# from from fds.sdk.IntradayTickHistory.model.pet import Pet
# or import this package, but before doing it, use:
# import sys
# sys.setrecursionlimit(n)

from fds.sdk.IntradayTickHistory.model.fields import Fields
from fds.sdk.IntradayTickHistory.model.intervals import Intervals
from fds.sdk.IntradayTickHistory.model.specialfield import Specialfield
from fds.sdk.IntradayTickHistory.model.tickhistory_response import TickhistoryResponse
