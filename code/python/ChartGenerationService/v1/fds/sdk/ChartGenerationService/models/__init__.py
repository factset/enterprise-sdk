# flake8: noqa

# import all models into this package
# if you have many models here with many references from one model to another this may
# raise a RecursionError
# to avoid this, import only the models that you directly need like:
# from from fds.sdk.ChartGenerationService.model.pet import Pet
# or import this package, but before doing it, use:
# import sys
# sys.setrecursionlimit(n)

from fds.sdk.ChartGenerationService.model.categories_error_response import CategoriesErrorResponse
from fds.sdk.ChartGenerationService.model.categorized_chart_list import CategorizedChartList
from fds.sdk.ChartGenerationService.model.category_list_response import CategoryListResponse
from fds.sdk.ChartGenerationService.model.chart_input import ChartInput
from fds.sdk.ChartGenerationService.model.chart_list import ChartList
from fds.sdk.ChartGenerationService.model.chart_list_error_response import ChartListErrorResponse
from fds.sdk.ChartGenerationService.model.error_response import ErrorResponse
from fds.sdk.ChartGenerationService.model.unauthorized_response import UnauthorizedResponse
