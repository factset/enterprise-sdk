# flake8: noqa

# import all models into this package
# if you have many models here with many references from one model to another this may
# raise a RecursionError
# to avoid this, import only the models that you directly need like:
# from from fds.sdk.FactSetETF.model.pet import Pet
# or import this package, but before doing it, use:
# import sys
# sys.setrecursionlimit(n)

from fds.sdk.FactSetETF.model.categories import Categories
from fds.sdk.FactSetETF.model.category import Category
from fds.sdk.FactSetETF.model.error_response import ErrorResponse
from fds.sdk.FactSetETF.model.error_response_sub_errors import ErrorResponseSubErrors
from fds.sdk.FactSetETF.model.etf_reference_data import EtfReferenceData
from fds.sdk.FactSetETF.model.etf_reference_data_request import EtfReferenceDataRequest
from fds.sdk.FactSetETF.model.etf_reference_data_response import EtfReferenceDataResponse
from fds.sdk.FactSetETF.model.ids import Ids
from fds.sdk.FactSetETF.model.metric import Metric
from fds.sdk.FactSetETF.model.metrics import Metrics
from fds.sdk.FactSetETF.model.metrics_response import MetricsResponse
