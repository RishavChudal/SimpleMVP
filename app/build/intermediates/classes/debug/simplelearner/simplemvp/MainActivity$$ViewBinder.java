// Generated code from Butter Knife. Do not modify!
package simplelearner.simplemvp;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class MainActivity$$ViewBinder<T extends simplelearner.simplemvp.MainActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427414, "field 'cloud' and method 'cloud'");
    target.cloud = finder.castView(view, 2131427414, "field 'cloud'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.cloud();
        }
      });
    view = finder.findRequiredView(source, 2131427415, "field 'sea' and method 'sea'");
    target.sea = finder.castView(view, 2131427415, "field 'sea'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.sea();
        }
      });
    view = finder.findRequiredView(source, 2131427416, "field 'mountain' and method 'mountain'");
    target.mountain = finder.castView(view, 2131427416, "field 'mountain'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.mountain();
        }
      });
    view = finder.findRequiredView(source, 2131427413, "field 'actionTv'");
    target.actionTv = finder.castView(view, 2131427413, "field 'actionTv'");
    view = finder.findRequiredView(source, 2131427412, "field 'displayImage'");
    target.displayImage = finder.castView(view, 2131427412, "field 'displayImage'");
  }

  @Override public void unbind(T target) {
    target.cloud = null;
    target.sea = null;
    target.mountain = null;
    target.actionTv = null;
    target.displayImage = null;
  }
}
